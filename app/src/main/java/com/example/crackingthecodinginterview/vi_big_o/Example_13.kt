package com.example.crackingthecodinginterview.vi_big_o

fun main() {

    var result = fib_13(6)
    println("result: $result")
}

fun fib_13(n: Int): Int {

    if (n <= 0) {
        return 0
    }

    else if (n == 1) {
        return 1
    }

    return n + fib_13(n - 1)
}

// 0, 1, 1, 2, 3, 5, 8