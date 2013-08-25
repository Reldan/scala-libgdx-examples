package com.rathboma.playpen.box2dcharacter

import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Vector3
import com.daggerfrog.Resources

class BackgroundFXRenderer {

  val backgroundFXBatch = new SpriteBatch()
//  Array<Debris> debrises = new Array<Debris>()
//
//  Array<Fish> fishes = new Array<Fish>()
  val backgroundBatch = new SpriteBatch()
  backgroundFXBatch.getProjectionMatrix().setToOrtho2D(0, 0, 800, 480)

  val background = Resources.groundSp


  //  createDebris()
//  createFishes()

  backgroundBatch.getProjectionMatrix().setToOrtho2D(0, 0, 128, 128)

//  private void createDebris() {
//    for(int i = 0 i<30++i) {
//      debrises.add(new Debris(new Vector2(MathUtils.random(-100, 800),MathUtils.random(-200, 400))))
//    }
//  }
//
//  private void createFishes() {
//    for(int i = 0 i<15++i) {
//      fishes.add(new Fish(new Vector2(MathUtils.random(-100, 800),MathUtils.random(-200, 400))))
//    }
//  }

//  float stateTime = 0
//  Vector3 lerpTarget = new Vector3()

  def render() {
    backgroundBatch.begin()
    background.draw(backgroundBatch)
    backgroundBatch.end()

//    backgroundFXBatch.begin()
//    for (Debris debris : debrises) {
//      if (debris.alive) {
//        debris.draw(backgroundFXBatch)
//      } else {
//        debris.reset()
//      }
//    }
//    for (Fish fish : fishes) {
//      if (fish.alive) {
//        fish.draw(backgroundFXBatch)
//      } else {
//        fish.reset()
//      }
//    }
//    backgroundFXBatch.end()
  }

  def resize(width: Int, height: Int) {
    backgroundFXBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height)
  }

  def dispose() {
//    fishes.clear()
//    debrises.clear()
    backgroundFXBatch.dispose()
    backgroundBatch.dispose()
  }

}
