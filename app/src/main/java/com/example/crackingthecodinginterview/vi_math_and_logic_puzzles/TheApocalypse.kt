package com.example.crackingthecodinginterview.vi_math_and_logic_puzzles

import kotlin.random.Random

fun main() {
    var result = runNFamilies(1000000)
    println(result)
}


fun runNFamilies(n: Int): Double {
    var boys = 0
    var girls = 0

    for (i in 0 until n) {
        val genders = runOneFamily()
        girls += genders[0]
        boys += genders[1]
    }

    return girls / (boys + girls).toDouble()
}

fun runOneFamily(): IntArray {

    var boys = 0
    var girls = 0

    while (girls == 0) {
        if (Random.nextBoolean()) {
            ++girls
        } else {
            ++boys
        }
    }

    return intArrayOf ( girls, boys )
}