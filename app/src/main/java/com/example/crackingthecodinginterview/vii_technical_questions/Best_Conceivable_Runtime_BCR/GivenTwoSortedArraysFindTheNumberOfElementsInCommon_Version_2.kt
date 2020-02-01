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

    val commonElements = findTheNumberOfElementsInCommon_Version_2(array1, array2)

    println("commonElements: $commonElements")
}

fun findTheNumberOfElementsInCommon_Version_2(
    array1: Array<Int>,
    array2: Array<Int>
): MutableList<Int> {

    val commonElements = mutableListOf<Int>()
    val size1 = array1.size
    val size2 = array2.size
    var i = 0
    var j = 0

    while (i < size1) {

        while (j < size2) {

            when {
                array1[i] < array2[j] -> {
                    i++
                }
                array1[i] > array2[j] -> {
                    j++
                }
                else -> {
                    commonElements.add(array1[i])
                    i++
                }
            }
            break
        }
    }

    return commonElements
}