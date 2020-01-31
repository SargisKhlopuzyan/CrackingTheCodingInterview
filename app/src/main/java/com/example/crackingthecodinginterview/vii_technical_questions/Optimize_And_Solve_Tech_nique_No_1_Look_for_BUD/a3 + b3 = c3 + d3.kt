package com.example.crackingthecodinginterview.vii_technical_questions.Optimize_And_Solve_Tech_nique_No_1_Look_for_BUD

import kotlin.math.pow


/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

/**
 * Example: Print all positive integer solutions to the equation a* + b* = c3 + d-1
 * where a, b, c, and d are integers between 1 and 1000.
 * */
fun main() {
//    a3_pluse_b3_equal_c3_pluse_d3_N3(100)
    a3_pluse_b3_equal_c3_pluse_d3_N2(
        100
    )
}


//O(N3) N*N*N
fun a3_pluse_b3_equal_c3_pluse_d3_N3(n: Int) {

    for (a in 1..n) {

        for (b in 1..n) {

            for (c in 1..n) {

                val d = (a * a * a + b * b * b - c * c * c).toDouble().pow(1 / 3.0)

                if ((a * a * a + b * b * b == c * c * c + d.toInt() * d.toInt() * d.toInt()) && d > 0 && d <= n) {
                    println("a: $a, b: $b, c: $c, d: ${d.toInt()}")
                }

            }

        }

    }
}

//O(N2) N*N
fun a3_pluse_b3_equal_c3_pluse_d3_N2(n: Int) {

    val hashMap = HashMap<Int, Pair<Int, Int>>()

    for (c in 1..n) {

        for (d in 1..n) {

            val result: Int = c * c * c + d * d * d
            hashMap[result] = Pair(c, d)

        }

    }

    for (a in 1..n) {

        for (b in 1..n) {

            val result = a * a * a + b * b * b
            val pair = hashMap[result]

            if (pair != null) {
                println("a: $a, b: $b, c: ${pair.first}, d: ${pair.second}")
            }

        }

    }

}