package com.daggerfrog

import com.rathboma.playpen.box2dcharacter.{IBox, Box}
import com.badlogic.gdx.graphics.g2d.{SpriteBatch, Sprite}

case class Room(x1: Int, y1: Int, x2: Int, y2: Int) {
  val walls: List[IBox] =
    Range(x1, x2 + 1).map(i ⇒ IBox(i, y1, 1)).toList :::
    Range(x1, x2 + 1).map(i ⇒ IBox(i, y2, 1)).toList :::
    Range(y1 + 1, y2).map(i ⇒ IBox(x1, i, 1)).toList :::
    Range(y1 + 1, y2).map(i ⇒ IBox(x2, i, 1)).toList
  val floor: List[IBox] =
    Range(x1 + 1, x2).flatMap(x ⇒ Range(y1 + 1, y2).map(y ⇒ IBox(x, y, 5))).toList
}

case class Defender(x1: Int, y1: Int)
