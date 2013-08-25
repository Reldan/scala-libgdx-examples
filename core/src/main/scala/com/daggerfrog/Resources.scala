package com.daggerfrog

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.TextureAtlas


object Resources {

//  val title = {
//    println(new java.io.File(".").getAbsolutePath)
//    new Sprite(new Texture(Gdx.files.internal(new java.io.File(".").getCanonicalPath + "/data/spritepack/title.png")))
//  }
//  val credits = new Sprite(new Texture(Gdx.files.internal("data/spritepack/credits.png")))
  // Sprite sprite = atlas.createSprite("otherimagename")

  val soldier = new Sprite(new Texture(Gdx.files.internal("data/spritepack/soldier.png"))).
  val map = new TextureAtlas(Gdx.files.internal("data/spritepack/packhigh"))
//  throw new Exception(new java.io.File(".").getAbsolutePath)

  // public AtlasRegion region = atlas.findRegion("imagename")
  // Sprite sprite = atlas.createSprite("otherimagename")

  val music = Gdx.audio.newMusic(Gdx.files.internal("data/audio/music.ogg"))

  val groundSp  = map.createSprite("ground")
  val parquetSp = map.createSprite("parquet")
  val stoneSp   = map.createSprite("stone")
  val mudSp     = map.createSprite("mud")
  val grassSp   = map.createSprite("grass")

}
