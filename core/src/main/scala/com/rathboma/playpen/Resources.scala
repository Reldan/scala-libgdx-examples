package com.rathboma.playpen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.TextureAtlas


object Resources {

  val title = {
    println(new java.io.File(".").getAbsolutePath)
    new Sprite(new Texture(Gdx.files.internal(new java.io.File(".").getCanonicalPath + "/data/spritepack/title.png")))
  }
  val credits = new Sprite(new Texture(Gdx.files.internal("data/spritepack/credits.png")))

  val atlas = new TextureAtlas(Gdx.files.internal("data/spritepack/packhigh"))
//  throw new Exception(new java.io.File(".").getAbsolutePath)

  // public AtlasRegion region = atlas.findRegion("imagename")
  // Sprite sprite = atlas.createSprite("otherimagename")

  val music = Gdx.audio.newMusic(Gdx.files.internal("data/audio/music.ogg"))

  val factoryP1 = atlas.createSprite("factoryp1")
  val factoryP2 = atlas.createSprite("factoryp2")
  val factoryP3 = atlas.createSprite("factoryp3")
  val factoryP4 = atlas.createSprite("factoryp4")

  val factoryP1Small = atlas.createSprite("factoryp1")
  val factoryP2Small = atlas.createSprite("factoryp2")
  val factoryP3Small = atlas.createSprite("factoryp3")
  val factoryP4Small = atlas.createSprite("factoryp4")

  val fighterP1 = atlas.createSprite("fighterp1")
  val fighterP2 = atlas.createSprite("fighterp2")
  val fighterP3 = atlas.createSprite("fighterp3")
  val fighterP4 = atlas.createSprite("fighterp4")

  val bomberP1 = atlas.createSprite("bomberp1")
  val bomberP2 = atlas.createSprite("bomberp2")
  val bomberP3 = atlas.createSprite("bomberp3")
  val bomberP4 = atlas.createSprite("bomberp4")

  val frigateP1 = atlas.createSprite("frigatep1")
  val frigateP2 = atlas.createSprite("frigatep2")
  val frigateP3 = atlas.createSprite("frigatep3")
  val frigateP4 = atlas.createSprite("frigatep4")

  val debrisSmall = atlas.createSprite("debrissmall")
  val debrisMed = atlas.createSprite("debrismed")
  val debrisLarge = atlas.createSprite("debrislarge")

  val fish1 = atlas.createSprite("fish1")
  val fish2 = atlas.createSprite("fish2")
  val fish3 = atlas.createSprite("fish3")
  val fish4 = atlas.createSprite("fish4")
  val fish5 = atlas.createSprite("fish5")
  val fish6 = atlas.createSprite("fish6")
  val fish7 = atlas.createSprite("fish7")
  val fish8 = atlas.createSprite("fish8")

  val needle = atlas.createSprite("needle")

  val background = atlas.createSprite("background")

  val blackFade = atlas.createSprite("blackfade")

  val laser = atlas.createSprite("laser")
  val missile = atlas.createSprite("missile")
  val bomb = atlas.createSprite("bomb")

  val production1 = atlas.createSprite("production1")
  val production2 = atlas.createSprite("production2")
  val production3 = atlas.createSprite("production3")

  val production_tile1 = atlas.createSprite("productiontile")
  val production_tile2 = atlas.createSprite("productiontile")
  val production_tile3 = atlas.createSprite("productiontile")
  val production_tile4 = atlas.createSprite("productiontile")

  val upgradeOutline = atlas.createSprite("upgradeoutline")
  val frigateOutline = atlas.createSprite("frigateoutline")
  val bomberOutline = atlas.createSprite("bomberoutline")
  val fighterOutline = atlas.createSprite("fighteroutline")

  val healthNone = atlas.createSprite("healthnone")
  val healthSome = atlas.createSprite("healthsome")
  val healthFull = atlas.createSprite("healthfull")

  val aButton = atlas.createSprite("abutton")
  val aCpuButton = atlas.createSprite("acpubutton")
  val aPlayerButton = atlas.createSprite("aplayerbutton")

  val cpuButton = atlas.createSprite("cpubutton")
  val playerButton = atlas.createSprite("playerbutton")

  val cnt1 = atlas.createSprite("1")
  val cnt2 = atlas.createSprite("2")
  val cnt3 = atlas.createSprite("3")
  val cnt4 = atlas.createSprite("4")
  val cnt5 = atlas.createSprite("5")

  val spark = atlas.createSprite("spark")
  val bubble = atlas.createSprite("bubble")
  val bigbubble = atlas.createSprite("bigbubble")
  val explosion = atlas.createSprite("explosion")

  val factoryHeavyDamage1 = atlas.createSprite("factoryheavydamage1")
  val factoryHeavyDamage2 = atlas.createSprite("factoryheavydamage2")
  val factoryHeavyDamage3 = atlas.createSprite("factoryheavydamage3")
  val factoryLightDamage1 = atlas.createSprite("factorylightdamage1")
  val factoryLightDamage2 = atlas.createSprite("factorylightdamage2")
  val factoryLightDamage3 = atlas.createSprite("factorylightdamage3")

  val touchArea1 = atlas.createSprite("touchArea")
  val touchArea2 = atlas.createSprite("touchArea")
  val touchArea3 = atlas.createSprite("touchArea")
  val touchArea4 = atlas.createSprite("touchArea")

  val help = atlas.createSprite("help")
  val musicOnOff = atlas.createSprite("music")
  val back = atlas.createSprite("back")
  val settings = atlas.createSprite("settings")
  val checkboxOn = atlas.createSprite("checkboxon")
  val checkboxOff = atlas.createSprite("checkboxoff")

}