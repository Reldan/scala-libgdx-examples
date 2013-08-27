package com.daggerfrog

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.rathboma.playpen.box2dcharacter.Box
import scala.util.Random

trait Positioned {
  val x: Int
  val y: Int
}

case class Soldier(x: Int, y: Int, acc:Int = 1) extends Positioned {
  val BOX_SIDE_PX = 16f
  def moveRandom = {
    val newAcc:Int = if ( 0 < x && x < 40) acc
    else
      if (x <= 1)
        1
      else
        -1
    Soldier(x + acc, y, newAcc)
  }

  def draw(spriteBatch: SpriteBatch) {

    new Box(x * BOX_SIDE_PX, y * BOX_SIDE_PX, Resources.soldiers(Random.nextInt(Resources.soldiers.size))).draw(spriteBatch, 10f)
  }
}

class Battlefield {

  var defenders = List.empty[Soldier]

  def move() {
    defenders = defenders.map(_.moveRandom)
  }

  def addDefender(soldier: Soldier) = {
    defenders ::= soldier
  }
}
