package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.physics.box2d.BodyDef.BodyType

class TetrisGlass (val util: Util) {
  val WIDTH = 10
  val HEIGHT = 20
  val BOX_SIDE_PX = 0.5f
  val WIDTH_PX = BOX_SIDE_PX * WIDTH
  val HEIGHT_PX = BOX_SIDE_PX * HEIGHT
  val boxes: Array[Array[Boolean]] = Array.ofDim[Boolean](WIDTH, HEIGHT)

  val body = {
    val width = WIDTH_PX
    val height = HEIGHT_PX
    util.createEdge(BodyType.StaticBody, -width, -height, width, -height, 0)
    util.createEdge(BodyType.StaticBody, -width, -height, -width, height, 0)
    util.createEdge(BodyType.StaticBody, width, -height, width, height, 0)
  }

  def addBox(column: Int, row: Int) {
    boxes.apply(column).update(row, true)
    val box = util.createBox(BodyType.KinematicBody, BOX_SIDE_PX * column, BOX_SIDE_PX * row, 3)
    box.setTransform(0f, 0f , 0f)
  }

}