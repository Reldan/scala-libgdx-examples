package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.graphics.g2d.{SpriteBatch, Sprite}
import com.rathboma.playpen.Resources

class Box(val x: Float, val y: Float, val Type: Byte = 1) extends Sprite {
  Type match {
    case 1 => this.set(Resources.bomberP2)
    case 2 => this.set(Resources.bomberP1)
  }

  override def draw(spriteBatch: SpriteBatch) {
    this.setPosition(x, y)
    super.draw(spriteBatch)
  }

}
