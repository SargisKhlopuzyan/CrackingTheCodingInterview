package com.example.crackingthecodinginterview.vi_big_o


fun main() {
    powersOf2_16(127)
}

fun powersOf2_16(n: Int): Int {
    if (n < 1) {
        return 0
    } else if (n == 1) {
        println(1)
        return 1
    } else {
        var prev =
            powersOf2_16(n / 2)
        var curr = prev * 2
        println(curr)
        return curr
    }
}