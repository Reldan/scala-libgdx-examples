package com.daggerfrog

trait Positioned {
  val x: Int
  val y: Int
}

case class Soldier(x: Int, y: Int) extends Positioned {
  def moveRandom = {
    Soldier(x + 1, y)
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
