package com.example.crackingthecodinginterview.vii_technical_questions.Appropriate_Code_Reuse

import kotlin.math.pow

/**
 * Created by Sargis Khlopuzyan, on 2/1/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val isBinEqualToHex = compareBinToHex("10011111", "9F")
    println("isBinEqualToHex: $isBinEqualToHex")
}

fun compareBinToHex(binary: String, hex: String): Boolean {

    val n1 = convertFromBase(binary, 2)
    val n2 = convertFromBase(hex, 16)

    println("n1: $n1 || n2: $n2")

    if (n1 < 0 || n2 < 0) {
        return false
    }

    return n1 == n2
}

fun convertFromBase(number: String, base: Int): Int {

    if (base < 2 || (base > 10 && base != 16)) {
        return -1
    }

    var value = 0

    for (i in (number.length - 1) downTo 0) {

        val digit = digitToValue(number[i])

        if (digit < 0 || digit >= base) {
            return -1
        }

        val exp = number.length - 1 - i
        value += digit * (base.toDouble().pow(exp.toDouble()).toInt())
    }

    return value
}

fun digitToValue(c: Char): Int {
    return try {
        Integer.parseInt(c.toString())
    } catch (e: NumberFormatException) {
        when (c) {
            'A' -> 10
            'B' -> 11
            'C' -> 12
            'D' -> 13
            'E' -> 14
            'F' -> 15
            else -> 16
        }
    }
}
