package com.rathboma.playpen


import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

object Main extends Application {
  override def main(arg: Array[String]) {
//    val str = "CGCGCTAAACTCCCCACCGCCACCCGAGGTCAATATGTCTTGTTGGCTTGCGTCTCTAATGTGCAGTTACCGAGCCACGAGCTGCGGCAGTCTGCCTTCGACGAAAAACTCGGCAGGCGCCGACGATTGTTCTGTCGTTACAGGGTGGTGGTACCGAGTGCCGTAACAACGCTGAACTGCGAGCAAAGGGTAGAGACTCTGCGATAACGCTTACCCGGCTGAACTGTCGATAAGATTTCTGATGGTGTGGCAATATCACTCCGTGGGAGAAAGCTGCGGATATGCTAATCTAGGAGACTCTCGACTCGTTGTGAAAGTACGTTTGTGCTTGGTGCTTGGCCTTCCAACATGGCCCGGCAACAAGACTAGTGAGCGGAGGTGATGTCCTTCTAGTTCCGTGACTAGAAACTTGGATGGGAACCGTGGCCGCTGGCCATGGCAGCCTAAAATTAGGGACATCCCCATCTCGAGCTCCGAAGGGGGATGGTCATAGTCCAGCCATCACAAGCGGTATGTCCATTCCAACTGCCGATGTCAGAGGGTAAGTGGACCTATGGCGTCCGGCCACAGATTTCGGGCCGACCAACTTGCCAAAGTGCCAACGATCACGGATCATTCCCAGTATAAGAGCCAACCTCGCGTGGCAAGCTTAGGTTTGCGGCCTTGCCCTGACGGTTGGACTTAAGGCCTATAGGTAATGCGCATTCGCAGGTTGTTGAGTACTAATTTTCTATCCGCCTCTTCATTCCGGACTTCGTCATCGAAGGGTCAAATGGGCTTCCTAAATATACAATACGCCCGATCTGGGCTGATAGCTCTTCGTGACTACAACTTCTGCCGCAACTTCACGACGCTCTATGTTGAGCTGTTAAGTCTACGGGGCTG"
//    val t = Map('A' -> 'T', 'C' -> 'G', 'T' -> 'A', 'G' -> 'C')
//    println(str.reverse.map(t))
//    foldLeft(List.empty[Char]) {
//      case (acc, ch) =>
//        ch :: acc
//    }

//    println(str.replace('T','U'))
//    val res = str
//      .foldLeft(Map('A' -> 0L, 'C' -> 0L, 'G' -> 0L, 'T' -> 0L)){
//      case(acc, ch) =>
//        acc + (ch -> (acc(ch) + 1L))
//    }
//      .values
//      .mkString(" ")

//    println(res)
//    val ourList: List[Long] = List(1L, 4, 5)
//    var res: Long = ourList
//      .map(_ * 2)
//      .filter(el => el > 5 && el < 13)
//      .reduceLeft(_*_)
//
//    res = 5
//
//    print(res)
    val cfg = new LwjglApplicationConfiguration()
    cfg.title = "puzzleplatform"
    cfg.useGL20 = false
    cfg.width = 1200
    cfg.height = 700
    cfg.resizable = false

    new LwjglApplication(new PlaypenGame(), cfg)
  }
}
