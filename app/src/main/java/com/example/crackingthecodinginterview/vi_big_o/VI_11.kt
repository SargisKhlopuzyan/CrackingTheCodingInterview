package com.example.crackingthecodinginterview.vi_big_o

/**
 * Created by Sargis Khlopuzyan, on 1/29/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    printSortedStrings_VI_11(2)
}

fun printSortedStrings_VI_11(remaining: Int) {
    printSortedStrings_VI_11(remaining, "")
}

fun printSortedStrings_VI_11(remaining: Int, prefix: String) {

    if (remaining == 0) {

        if (isInOrder_VI_11(prefix)) {
            println("prefix: $prefix")
        }

    } else {

        for (c in 'a'..'z') {
            printSortedStrings_VI_11(remaining - 1, prefix + c)
        }

    }
}

fun isInOrder_VI_11(s: String): Boolean {

    var isInOrder = true

    for (i in 1 until s.length) {

        val prev = s[i - 1]
        val curr = s[i]

        if (prev > curr) {
            isInOrder = false
        }

    }

    return isInOrder
}