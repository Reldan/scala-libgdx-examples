package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.graphics.g2d.{SpriteBatch, Sprite}
import com.daggerfrog.Resources

case class IBox( x: Int,  y: Int,  Type:Byte = 1)

class Box(val x: Float, val y: Float, val Type: Byte = 1) extends Sprite {
  Type match {
    case 1 => this.set(Resources.parquetSp)
    case 2 => this.set(Resources.groundSp)
    case 3 => this.set(Resources.mudSp)
    case 4 => this.set(Resources.stoneSp)
    case 5 => this.set(Resources.grassSp)
    case 6 ⇒  this.set(Resources.soldier)
  }

  override def draw(spriteBatch: SpriteBatch, alphaModulation: Float) {
    this.setPosition(x, y)
    super.draw(spriteBatch, alphaModulation)
  }

}
