package com.example.crackingthecodinginterview.vii_technical_questions.Best_Conceivable_Runtime_BCR

/**
 * Created by Sargis Khlopuzyan, on 2/1/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

/**
 * Given two sorted arrays, find the number of elements in common.
 * The arrays are the same length and each has all distinct elements.
 * */
fun main() {
    val array1 = arrayOf(13, 27, 35, 40, 49, 55, 59)
    val array2 = arrayOf(17, 35, 39, 40, 55, 58, 60)

    findTheNumberOfElementsInCommon(array1, array2)
}

fun findTheNumberOfElementsInCommon(array1: Array<Int>, array2: Array<Int>) {

    val hashMap1 = HashMap<Int, Int>()
    val hashMap2 = HashMap<Int, Int>()

    for (i in array1.indices) {
        hashMap1[array1[i]] = i
        hashMap2[array2[i]] = i
    }

    val elementsInCommon = mutableListOf<Int>()

    for (element in array1) {
        if (hashMap1[element] != null && hashMap2[element] != null) {
            elementsInCommon.add(element)
        }
    }

    println("elementsInCommon: $elementsInCommon")
}