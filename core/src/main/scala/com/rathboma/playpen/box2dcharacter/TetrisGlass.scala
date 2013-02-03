package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.physics.box2d.BodyDef.BodyType

class TetrisGlass (val util: Util) {
  val WIDTH = 11
  val HEIGHT = 20
  val BOX_SIDE_PX = 0.5f
  val WIDTH_PX = BOX_SIDE_PX * WIDTH
  val HEIGHT_PX = BOX_SIDE_PX * HEIGHT
  val width = WIDTH_PX
  val height = HEIGHT_PX
  val boxes: Array[Array[Boolean]] = Array.ofDim[Boolean](WIDTH, HEIGHT)

  val body = {

    util.createEdge(BodyType.StaticBody, -width, -height, width, -height, 0)
    util.createEdge(BodyType.StaticBody, -width, -height, -width, height, 0)
    util.createEdge(BodyType.StaticBody, width, -height, width, height, 0)
  }

  def addBox(column: Int, row: Int) {
    print(column)
    print(row)
    boxes.apply(column).update(row, true)
    val box = util.createBox(BodyType.KinematicBody, BOX_SIDE_PX, BOX_SIDE_PX, 3)
    box.setTransform(0f - width + (2 * column + 1) * BOX_SIDE_PX, 0f - height + (2 * row + 1) * BOX_SIDE_PX, 0f)
  }
}