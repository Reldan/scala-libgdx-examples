package com.daggerfrog

import com.badlogic.gdx.physics.box2d.BodyDef.BodyType
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.rathboma.playpen.box2dcharacter.{Box, Util}

class MainMap (val util: Util, widthBox: Int, heightBox: Int) {
  val BOX_SIDE_PX = 16f
  val WIDTH_PX = BOX_SIDE_PX * widthBox
  val HEIGHT_PX = BOX_SIDE_PX * heightBox
  val width = WIDTH_PX
  val height = HEIGHT_PX
  val boxes: Array[Array[Byte]] = Array.ofDim[Byte](widthBox, heightBox)

  val body = {
    util.createEdge(BodyType.StaticBody, -width, -height, width, -height, 0)
    util.createEdge(BodyType.StaticBody, -width, -height, -width, height, 0)
    util.createEdge(BodyType.StaticBody, width, -height, width, height, 0)
  }

  def setRoom(room: Room) {
    room.walls.foreach(b ⇒ addBox(b.x, b.y, 1))
    room.floor.foreach(b ⇒ addBox(b.x, b.y, 5))
  }

  def addBox(column: Int, row: Int, boxType: Byte = 1) {
    if (widthBox > column && heightBox > row) {
      boxes(column).update(row, boxType)
      val box = util.createBox(BodyType.KinematicBody, BOX_SIDE_PX, BOX_SIDE_PX, 3)
      box.setTransform(0f - width + (2 * column + 1) * BOX_SIDE_PX, 0f - height + (2 * row + 1) * BOX_SIDE_PX, 0f)
    }
  }

  def draw(spriteBatch: SpriteBatch) {
    for(column <- 0 until widthBox; row <- 0 until heightBox) {
      val box = boxes(column)(row)
      val sprite = box match {
        case 1 => Resources.parquetSp
        case 2 => Resources.groundSp
        case 3 => Resources.mudSp
        case 4 => Resources.stoneSp
        case 5 => Resources.grassSp
        case 6 ⇒  Resources.soldier
      }
      if (box > 0)
        new Box(column * BOX_SIDE_PX, row * BOX_SIDE_PX, sprite).draw(spriteBatch, 10f)
    }
  }

  def fill() {
    for(column <- 0 until widthBox; row <- 0 until heightBox) {
      addBox(column, row, 3)
    }
  }

  def tick() {

  }
}
