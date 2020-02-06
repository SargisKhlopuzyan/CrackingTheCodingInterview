package com.example.crackingthecodinginterview._1_Arrays_And_Strings.Interview_Questions

/**
 * Created by Sargis Khlopuzyan, on 2/6/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val isUnique = isUnique_UsingAdditionalDataStructures("Sargi+Khlopuzy-n")
    println("isUnique: $isUnique")
}

private fun isUnique_UsingAdditionalDataStructures(str: String): Boolean {

    val strArray = str.toCharArray()
    val hashMap = HashMap<Char, Int>()

    var count: Int?
    for (c in strArray) {
        count = hashMap[c] ?: 0
        hashMap[c] = count + 1
    }

    for (c in strArray) {
        hashMap[c]?.let {
            if (it > 1) {
                return false
            }
        }
    }

    return true
}