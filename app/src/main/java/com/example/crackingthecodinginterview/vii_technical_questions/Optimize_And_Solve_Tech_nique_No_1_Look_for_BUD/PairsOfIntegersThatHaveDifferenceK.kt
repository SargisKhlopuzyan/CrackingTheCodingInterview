package com.example.crackingthecodinginterview.vii_technical_questions.Optimize_And_Solve_Tech_nique_No_1_Look_for_BUD

/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

/**
 * Example: Given an array of distinct integer values, count the number of pairs of integers that
 * have difference k. For example, given the array {1 , 7, 5, 9, 2, 12, 3} and the difference
 * k = 2, there are four pairs with difference 2: (1 , 3) j (3 , S), (5 , 7), (7 , 9),
 * */

fun main() {

    var array = arrayOf(1, 7, 5, 9, 9, 5, 2, 12, 3)

    var pairs =
        findPairsOfIntegersThatHaveDifferenceK(
            array,
            2
        )

    println("pairs: $pairs")
}

//O(N)
private fun findPairsOfIntegersThatHaveDifferenceK(
    array: Array<Int>,
    k: Int
): ArrayList<Pair<Int, Int>> {

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