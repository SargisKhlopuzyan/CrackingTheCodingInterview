package com.example.crackingthecodinginterview.vii_technical_questions

/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    var array = arrayOf(1, 7, 5, 9, 9, 5, 2, 12, 3)

    var pairs = findPairsOfIntegersThatHaveDifferenceK(array, 2)

    println("pairs: $pairs")
}

//O(N)
private fun findPairsOfIntegersThatHaveDifferenceK(array: Array<Int>, k: Int): ArrayList<Pair<Int, Int>> {

    var hashMap = HashMap<Int, Any>()

//    O(N)
    array.forEachIndexed { index: Int, element: Int ->
        hashMap[element] = index
    }

    var pairs = arrayListOf<Pair<Int, Int>>()

//    O(N)
    array.forEachIndexed { index: Int, element: Int ->
        if (hashMap[element + k] != null) {
            pairs.add(Pair(element, element + k))
        }
    }

    return pairs
}