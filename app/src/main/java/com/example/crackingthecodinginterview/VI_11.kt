package com.example.crackingthecodinginterview

/**
 * Created by Sargis Khlopuzyan, on 1/29/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    printSortedStrings_vi_11(3)
}

fun printSortedStrings_vi_11(remaining: Int) {
    printSortedStrings_vi_11(remaining, "")
}

fun printSortedStrings_vi_11(remaining: Int, prefix: String) {

    if (remaining == 0) {
        if (isInOrder_vi_11(prefix)) {
            println("prefix: $prefix")
        }
    } else {
        for (c in 'a'..'z') {
            printSortedStrings_vi_11(remaining - 1, prefix + c)
        }
    }
}

fun isInOrder_vi_11(s: String): Boolean {
    var isOrdered = true
    for (i in 1 until s.length) {
        var prev = s[i - 1]
        var curr = s[i]
        if (prev > curr) {
            isOrdered = false
        }
    }
    return isOrdered
}