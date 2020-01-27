package com.example.crackingthecodinginterview

fun main() {
    allFib(16)
}

fun allFib(n: Int) {
    var memo = IntArray(n + 1)

    for (i in 0 until n) {
        println("$i : ${fib_15(i, memo)}")
    }

}

fun fib_15(n: Int, memo: IntArray): Int {

    if (n <= 0) {
        return 0
    } else if (n == 1) {
        return 1
    } else if (memo[n] > 0) {
        return memo[n]
    } else {
        memo[n] = fib_15(n - 1, memo) + fib_15(n - 2, memo)
        return memo[n]
    }
}

// 0, 1, 1, 2, 3, 5, 8