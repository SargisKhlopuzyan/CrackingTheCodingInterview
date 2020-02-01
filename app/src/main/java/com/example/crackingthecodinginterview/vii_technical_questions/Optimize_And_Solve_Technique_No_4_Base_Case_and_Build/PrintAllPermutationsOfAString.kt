package com.example.crackingthecodinginterview.vii_technical_questions.Optimize_And_Solve_Technique_No_4_Base_Case_and_Build

/**
 * Created by Sargis Khlopuzyan, on 1/31/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    var stringsArray = mutableListOf("a")

    for (c in 'b'..'z') {

        val margeArray = mutableListOf<String>()

        for (str in stringsArray) {

            val newMutableArrayList = insert(str, c.toString())

            margeTwoArrays(margeArray, newMutableArrayList)
        }

        stringsArray = margeArray
    }

    println("stringsArray.size: ${stringsArray.size}")
    println("stringsArray: $stringsArray")
}

//Nc - text size

//O(Nc)
private fun insert(text: String, insertingCharacter: String): MutableList<String> {

    val array = mutableListOf<String>()

    var leftOriginal = ""

    for (indexI in text.indices) {

        val left = leftOriginal + insertingCharacter

        leftOriginal += text[indexI]

        var right = ""

        for (indexJ in indexI until text.length) {
            right += text[indexJ]
        }

        array.add(left + right)
    }

    array.add(text + insertingCharacter)

    return array
}

private fun margeTwoArrays(
    array1: MutableList<String>,
    array2: MutableList<String>
): MutableList<String> {
    array1.addAll(array2)
    return array1
}