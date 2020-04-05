package com.example.crackingthecodinginterview.vi_math_and_logic_puzzles

import kotlin.math.sqrt

fun main() {

    val max = 17
    val array = sieveOfEratosthenes(max)
    println(array.asList())
}

fun sieveOfEratosthenes(max: Int): Array<Boolean> {

    val array = Array(max + 1) { true }
    var prime = 2

    while (prime < sqrt(max.toDouble())) {

        var i = prime * prime

        while (i <= max) {
            array[i] = false
            i += prime
        }

        ++prime

        while (prime <= max && !array[prime]) {
            ++prime
        }

    }

    return array
}