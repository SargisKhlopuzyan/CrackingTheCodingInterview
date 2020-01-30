package com.example.crackingthecodinginterview.other

/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    val array1 = arrayOf(1, 2, 4, 6, 2, 4, 1, 1)
    val array2 = arrayOf(4, 16, 36, 1, 16, 1, 4, 1)

    val isEqual = isTwoArraysEqual(
        array1,
        array2
    )
    println("isEqual: $isEqual")
}

fun isTwoArraysEqual(array1: Array<Int>, array2: Array<Int>): Boolean {

    val hashMap1 = HashMap<Int, Int>()
    val hashMap2 = HashMap<Int, Int>()

    for (i in array1.indices) {

        val element1 = array1[i] * array1[i]
        val elementsCount1 = hashMap1[element1]

        if (elementsCount1 == null) {
            hashMap1[element1] = 1
        } else {
            hashMap1[element1] = elementsCount1 + 1
        }

        val element2 = array2[i]
        val elementsCount2 = hashMap2[element2]

        if (elementsCount2 == null) {
            hashMap2[element2] = 1
        } else {
            hashMap2[element2] = elementsCount2 + 1
        }
    }

    for (i in array2) {
        if (hashMap1[i] != hashMap2[i]) {
            return false
        }
    }

    return true
}