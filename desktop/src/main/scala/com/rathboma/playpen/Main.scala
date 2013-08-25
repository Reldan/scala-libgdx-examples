package com.rathboma.playpen


import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.daggerfrog.PlaypenGame

object Main extends Application {
  override def main(arg: Array[String]) {
    val cfg = new LwjglApplicationConfiguration()
    cfg.title = "puzzleplatform"
    cfg.useGL20 = false
    cfg.width = 1200
    cfg.height = 680
    cfg.resizable = false

    new LwjglApplication(new PlaypenGame(), cfg)
  }
}
