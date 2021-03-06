package com.rathboma.playpen.box2dcharacter


import com.badlogic.gdx.{Gdx, Screen}
import com.badlogic.gdx.Input.Keys
import com.badlogic.gdx.InputAdapter
import com.badlogic.gdx.graphics.GL10
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.{Vector3, Matrix4}
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer
import com.badlogic.gdx.physics.box2d.{World => Box2DWorld}
import com.badlogic.gdx.graphics.Color
import com.daggerfrog._
import com.daggerfrog.Room
import com.daggerfrog.Defender


class MainScreen(game: PlaypenGame) extends InputAdapter with Screen {
  var lastTick = System.nanoTime
  val world = new Box2DWorld(new Vector2(0, -20), true)
  val util = new Util(world)
  val backgroundFX = new BackgroundFXRenderer()
//  val player = new Player(world)
  val cam = new OrthographicCamera(28, 20)
  val renderer = new Box2DDebugRenderer()
  val matrix = new Matrix4()
  val font = new BitmapFont()
  font.setColor(Color.WHITE)
  val batch = new SpriteBatch()
  val point = new Vector3()
  Gdx.input.setInputProcessor(this)
  // VARS
  val BOX_SIDE_PX = 16f
  var stillTime = 0f
  val battlefield = new Battlefield()
  val rand = scala.util.Random

  Range(1, 20).foreach(_ ⇒ battlefield.addDefender(Soldier(rand.nextInt(100), rand.nextInt(60))))

  val glass = new MainMap(util, 100, 60)

  //place to config
  val rooms = List(
    new Room(0, 0, 99, 59)
  )

  glass.fill()

  rooms.foreach(t ⇒ glass.setRoom(t))

  def render(delta: Float) {
    Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT)
    cam.apply(Gdx.gl10)
    matrix.set(cam.combined)
//    renderer.render(world, matrix)
//    cam.project(point.set(player.position.x, player.position.y, 0))
//    batch.begin()
//    font.drawMultiLine(batch,
//      "friction: " + player.physicsFixture.getFriction + "\ngrounded: " + grounded,
//      point.x + 20, point.y)
//    batch.end()
    backgroundFX.render()
    batch.begin()
    glass.draw(batch)
    battlefield.defenders.foreach(t ⇒ t.draw(batch))
    batch.end()
    update(delta)
  }

  def update(delta: Float) {
    val now = System.nanoTime
    if ((now - lastTick) > 100000000) {
//      player.moveDown()
      lastTick = now
      println("tick")
      battlefield.move()
//      battlefield.defenders.foreach(t ⇒ t.moveRandom)
      glass.tick()
    }
//
//    player.limitVelocity()
//
//    if(!leftPressed && !rightPressed) {
//      stillTime = stillTime + Gdx.graphics.getDeltaTime
//      player.box.setLinearVelocity(player.velocity.x * 0.9f, player.velocity.y)
//    }

//    if (grounded) {
//      if(leftPressed || rightPressed) {
//        player.physicsFixture.setFriction(0.2f)
//        stillTime = 0
//      } else if(stillTime > 0.2) {
//        player.physicsFixture.setFriction(100f)
//      }
//    } else {
//      player.physicsFixture.setFriction(0f)
//    }

//    if (leftPressed)
//      player.moveLeft()
//      leftPressed = false
//    if (rightPressed)
//      player.moveRight()
//      rightPressed = false
//
//    if (shouldJump) {
//      shouldJump = false
//      if (grounded) {
//        player.jump()
//      }
//    }
//    world.step(Gdx.graphics.getDeltaTime, 4, 4)
//    player.box.setAwake(true)
//
  }

  override def keyDown(keycode: Int) = {
    false
  }

  override def keyUp(keycode: Int) = {
    false
  }

  def resize(width: Int, height: Int) {

  }

  def show() {

  }

  def hide() {

  }

  def pause() {

  }

  def resume() {

  }

  def dispose() {

  }

}
