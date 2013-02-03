package com.rathboma.playpen.box2dcharacter


import scalaj.collection.Imports._
import com.badlogic.gdx.physics.box2d.BodyDef
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType
import com.badlogic.gdx.physics.box2d.PolygonShape
import com.badlogic.gdx.physics.box2d.{World => Box2DWorld}


class Player(world: Box2DWorld) {
  var doJump = false
  val MAX_VELOCITY = 7f

  val box = {
    val bodyDef = new BodyDef()
    bodyDef.`type` = BodyType.KinematicBody
    world.createBody(bodyDef)  
  }
  
  val physicsFixture = {
    val poly = new PolygonShape
    poly.setAsBox(0.45f, 1.4f)
    val physicsFixture = box.createFixture(poly, 1)
    poly.dispose()
    physicsFixture
  }
  
  box.setBullet(true)

  box.setTransform(0.0f, 0.0f, 0)
  box.setFixedRotation(true)

  var lastGroundTime: Long = 0

  def velocity = box.getLinearVelocity
  def position = box.getPosition

  def limitVelocity() {
    velocity.x = math.signum(velocity.x) * MAX_VELOCITY
    box.setLinearVelocity(velocity.x, velocity.y)
  }

  def jump() {
    box.setLinearVelocity(velocity.x, 0)
    box.setTransform(position.x, position.y + 0.01f, 0)
    box.applyLinearImpulse(0, 30, position.x, position.y)
  }

  def moveLeft() { if (velocity.x > -MAX_VELOCITY) {
    box.setTransform(position.x - 1f, position.y, 0)
    box.applyLinearImpulse(-2f, 0, position.x, position.y)
    }
  }

  def moveDown() {
    box.setTransform(position.x, position.y - 1f, 0)
  }

  def moveRight() {
    if (velocity.x < MAX_VELOCITY)
      box.setTransform(position.x + 1f, position.y, 0)
      box.applyLinearImpulse(2f, 0, position.x, position.y)
  }

  def isGrounded: Boolean = world.getContactList.asScala.exists{contact =>
    if (contact.isTouching) {
      val position = box.getPosition
      val manifold = contact.getWorldManifold
      var below = false
      manifold.getPoints.foreach{point =>
        below = (point.y < position.y - 1.5f) || below
      }
      if (below) true else false
    } else false
  }

}