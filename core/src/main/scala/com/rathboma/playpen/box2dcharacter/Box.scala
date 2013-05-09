package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.graphics.g2d.{SpriteBatch, Sprite}
import com.rathboma.playpen.Resources

class Box(val x: Float, val y: Float, val Type: Byte = 1) extends Sprite {
  Type match {
    case 1 => this.set(Resources.parquetSp)
    case 2 => this.set(Resources.groundSp)
    case 3 => this.set(Resources.mudSp)
    case 4 => this.set(Resources.stoneSp)
    case 5 => this.set(Resources.grassSp)
  }

  override def draw(spriteBatch: SpriteBatch) {
    this.setPosition(x, y)
    super.draw(spriteBatch)
  }

}
