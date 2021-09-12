import elements.Other
import elements.Paper
import elements.Rock
import elements.Scissors
import elements.parent.Suit
import helper.Playagain
import helper.StringContainer

fun main(args: Array<String>) {
    println("===========================")
    println("SELAMAT DATANG DI GAME SUIT")
    println("      you VS computer      ")
    startSuitWithCom()
}

 fun startSuitWithCom() {
    val paper = Paper("paper")
    val rock = Rock("rock")
    val scissors = Scissors("scissors")
    // TODO: 07/09/21 "Tugas buat hari kemis, 9/9/21" -> solved this line (use do-while)
    /**
     * Temen2 ngerjakan loop ketika user input selain gunting, batu, kertas
     * User input selain gunting, batu, kertas -> fungsi redline s/d success -> di loop (diulangin)
     * User disuruh input lagi
     * */


    do {
        val resultList: List<Suit> = listOf(paper, rock, scissors)
        val compSuit = resultList.random()
        println("===========================")
        println("computer milih -> ${compSuit.name}")
        println("input suit (kertas, gunting, batu)")

        val input = readLine().toString()

        val mySuit = when (input) {
            "gunting" -> Scissors(StringContainer.scissors)
            "batu" -> Rock(StringContainer.rock)
            "kertas" -> Paper(StringContainer.paper)
            //penambahan element other agar saat input selain gunting, batu, kertas tidak draw
            else -> Other(StringContainer.other)

        }

        val result = mySuit.actionAgainst(compSuit)
        println("${result.status} | you: ${mySuit.name} vs comp: ${compSuit.name}")

        //penambahan fungsi validasi input
        val valid = Validator()
        valid.validasi(input)

    } while (!valid.validasi(input))

    //penambahan fungsi pilihan bermain lagi
    val playagain = Playagain()
    playagain.play()

    }

//    when (yes) {
//        "yes"startSuitWithCom()
//    } else {
//
//    }
//
//private fun startSuit() {
//    println("player 1: silahkan input")
//    val input1 = readLine()
//    val suit1 = when (input1) {
//        "gunting" -> Scissors(StringContainer.scissors)
//        "batu" -> Rock(StringContainer.rock)
//        "kertas" -> Paper(StringContainer.paper)
//        else -> Suit("nothing else")
//    }
//
//    if (suit1.name != "nothing else") {
//        println("player 2: silahkan input")
//        val input2 = readLine()
//        val suit2 = when (input2) {
//            "gunting" -> Scissors(StringContainer.scissors)
//            "batu" -> Rock(StringContainer.rock)
//            "kertas" -> Paper(StringContainer.paper)
//            else -> Suit("nothing else")
//        }
//
//        if (suit2.name != "nothing else") {
//            val resultSuit1 = suit1.actionAgainst(suit2)
//            val resultSuit2 = suit2.actionAgainst(suit1)
//
//            println("player1 = ${resultSuit1.status}")
//            println("player2 = ${resultSuit2.status}")
//        } else {
//            println("silahkan input kembali")
//            startSuit()}
//    } else {
//        println("silahkan input kembali")
//        startSuit()
//    }
