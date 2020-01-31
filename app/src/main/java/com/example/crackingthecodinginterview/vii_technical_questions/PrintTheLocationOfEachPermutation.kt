package com.example.crackingthecodinginterview.vii_technical_questions

/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

//    N1 is length of s
//    N2 is length of b

    val s = "abbc"

    val b = "cbabadcbbabbcbabaabccbabc"

    val arrayS = Array(s.length) { "" }
    val arrayB = Array(b.length) { "" }

//    O(N1)
    for ((index, element) in s.withIndex()) {
        arrayS[index] = element.toString()
    }

//    O(N2)
    for ((index, element) in b.withIndex()) {
        arrayB[index] = element.toString()
    }

//    O(N2-N1)
    for (index in 0..(b.length - s.length)) {
        //O(N1)
        isTwoArraysEqual(arrayS, arrayB, index, s.length)
    }
}

//O(N1)
private fun isTwoArraysEqual(
    arrayS: Array<String>,
    arrayB: Array<String>,
    startIndex: Int,
    itemsCount: Int
): Boolean {

    val hashMap1 = HashMap<String, Int>()
    val hashMap2 = HashMap<String, Int>()

//    O(N1)
    for (i in 0 until itemsCount) {

        //

        val element1 = arrayS[i]
        val value1 = hashMap1[element1]
        if (value1 != null) {
            hashMap1[element1] = value1 + 1
        } else {
            hashMap1[element1] = 1
        }

        //

        val element2 = arrayB[i + startIndex]
        val value2 = hashMap2[element2]
        if (value2 != null) {
            hashMap2[element2] = value2 + 1
        } else {
            hashMap2[element2] = 1
        }

        //
    }

//    O(N1)
    for (i in arrayS) {

        if (hashMap1[i] != hashMap2[i]) {
            return false
        }

    }

//    O(N1)
    var strB = "["
    for (i in startIndex until (startIndex + itemsCount)) {
        if (i != startIndex) {
            strB += ", "
        }
        strB += arrayB[i]
    }
    strB += "]"

    println("arrayB: $strB, arrayS: ${arrayS.asList()}")

    return true

}