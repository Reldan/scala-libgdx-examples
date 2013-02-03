package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.physics.box2d.BodyDef.BodyType
import com.badlogic.gdx.physics.box2d.{PolygonShape, World, EdgeShape, BodyDef}
import com.badlogic.gdx.math.Vector2


class Util(val world: World) {

  def createEdge(t: BodyType, x1: Float, y1: Float, x2: Float, y2: Float, density: Float) = {
    val bDef = new BodyDef
    bDef.`type` = t
    val box = world.createBody(bDef)
    val poly = new EdgeShape()
    poly.set(new Vector2(0, 0), new Vector2(x2 - x1, y2 - y1))
    box.createFixture(poly, density)
    box.setTransform(x1, y1, 0)
    poly.dispose()
    box
  }


  def createBox(bType: BodyType, width: Float, height: Float, density: Float) = {
    val bDef = new BodyDef()
    bDef.`type` = bType
    val box = world.createBody(bDef)
    val poly = new PolygonShape()
    poly.setAsBox(width, height)
    box.createFixture(poly, density)
    poly.dispose()
    box
  }
}
