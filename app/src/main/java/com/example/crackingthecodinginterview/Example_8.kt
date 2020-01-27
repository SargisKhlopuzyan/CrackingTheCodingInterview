package com.example.crackingthecodinginterview

import kotlin.math.min

fun main() {
    var strings = arrayOf("oasf", "oaa", "aas", "aba", "acaa", "ass", "eee", "fff", "oas")

    sortingStrings(strings)

    println(strings.toList().toString())
}

fun sortingStrings(strings: Array<String>) {

    for (i in 0 until strings.size - 1) {

        var chars = strings[i].toCharArray()

        var isReversed = false

        for (j in 0 until chars.size - 1) {

            for (k in j + 1 until chars.size) {

                if (chars[j] > chars[k]) {

                    val temp = chars[j]
                    chars[j] = chars[k]
                    chars[k] = temp

                    isReversed = true
                }
            }
        }

        if (isReversed) {
            strings[i] = String(chars)
        }
    }

    for (i in 0 until strings.size - 1) {

        for (j in i + 1 until strings.size) {

            val n = min(strings[i].length, strings[j].length)

            for (k in 0 until n) {
                if (strings[i][k] > strings[j][k] || (k == n - 1 && strings[i].length > strings[j].length)) {

                    println("***** strings[$i] : ${strings[i]}, strings[$j]: ${strings[j]}")

                    val temp = strings[i]
                    strings[i] = strings[j]
                    strings[j] = temp

                    break
                } else if (strings[i][k] < strings[j][k]) {
                    break
                }
            }
        }
    }
}

/*

a = strings.size
s = max of strings[i].size

O_1 = (a*s*log(s))

*************************************

1, 2, 3, (a-1) = (1*(a-1)/2)

O_2_1 = (a-1) * log((a-1)/2) = a * log(a)
O_2 = s*a*log(a)


O = O_1+ O_2 a*s*log(s) + s*a*log(a)

*************************************

*/