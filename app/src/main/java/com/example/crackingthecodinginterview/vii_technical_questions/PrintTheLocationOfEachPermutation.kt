package com.example.crackingthecodinginterview.vii_technical_questions

/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    val s = "abbc"

    val b = "cbabadcbbabbcbabaabccbabc"

    val array1 = Array(s.length) {
        'n'
    }

    val array2 = Array(b.length) {
        'n'
    }

    for ((index, c) in s.withIndex()) {
        array1[index] = c
    }

    isTwoArraysEqual(array1, array2)

}

private fun isTwoArraysEqual(array1: Array<Char>, array2: Array<Char>): Boolean {

    var hashMap1 = HashMap<Char, Int>()
    var hashMap2 = HashMap<Char, Int>()

    for (i in array1.indices) {

        val element1 = array1[i]

        val value1 = hashMap1[element1]
        if (value1 != null) {
            hashMap1[element1] = value1 + 1
        } else {
            hashMap1[element1] = 1
        }

        val element2 = array2[i]

        val value2 = hashMap2[element2]
        if (value2 != null) {
            hashMap2[element2] = value2 + 1
        } else {
            hashMap2[element2] = 1
        }

    }

    for (i in array1) {

        if (hashMap1[i] != hashMap2[i]) {
            return false
        }

    }

    return true

}