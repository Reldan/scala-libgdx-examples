package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.physics.box2d.BodyDef.BodyType
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import scala.util.Random

class TetrisGlass (val util: Util) {
  val WIDTH = 74
  val HEIGHT = 44
  val BOX_SIDE_PX = 16f
  val WIDTH_PX = BOX_SIDE_PX * WIDTH
  val HEIGHT_PX = BOX_SIDE_PX * HEIGHT
  val width = WIDTH_PX
  val height = HEIGHT_PX
  val boxes: Array[Array[Byte]] = Array.ofDim[Byte](WIDTH, HEIGHT)

  val body = {
    util.createEdge(BodyType.StaticBody, -width, -height, width, -height, 0)
    util.createEdge(BodyType.StaticBody, -width, -height, -width, height, 0)
    util.createEdge(BodyType.StaticBody, width, -height, width, height, 0)
  }

  def addBox(column: Int, row: Int, boxType: Byte = 1) {
    boxes.apply(column).update(row, boxType)
    val box = util.createBox(BodyType.KinematicBody, BOX_SIDE_PX, BOX_SIDE_PX, 3)
    box.setTransform(0f - width + (2 * column + 1) * BOX_SIDE_PX, 0f - height + (2 * row + 1) * BOX_SIDE_PX, 0f)
  }

  def draw(spriteBatch: SpriteBatch) {
    for(column <- 0 until WIDTH; row <- 0 until HEIGHT) {
      val box = boxes(column)(row)
      if (box > 0)
        new Box(column * BOX_SIDE_PX, row * BOX_SIDE_PX, box).draw(spriteBatch)
    }
  }

  def fill() {
    for(column <- 0 until WIDTH; row <- 0 until HEIGHT) {
      addBox(column, row, (Random.nextInt(5) + 1).toByte)
    }
  }

  def tick() {

  }
}
