package com.daggerfrog

import com.badlogic.gdx.Game
import com.rathboma.playpen.box2dcharacter.MainScreen

class PlaypenGame extends Game {

  override def create() {
    setScreen(new MainScreen(this))
  }
}
