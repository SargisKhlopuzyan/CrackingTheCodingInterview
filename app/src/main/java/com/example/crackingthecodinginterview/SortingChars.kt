package com.example.crackingthecodinginterview

fun main() {
    var chars = arrayOf("o", "k", "a", "b", "c", "d", "e", "f")

    sortingChars(chars)

    println(chars.toList().toString())
}

fun sortingChars(chars: Array<String>) {

    for (i in 0 until chars.size - 1) {

        for (j in i + 1 until chars.size) {

            if (chars[i] > chars[j]) {

                val temp = chars[i]
                chars[i] = chars[j]
                chars[j] = temp

            }
        }
    }
}


/*

(N-1)

1, 2, 3, (N-1) = (1*(N-1)/2)

O = (N-1) * log((N-1)/2) = N*log(N)


*** O(N*log(N)) ***
*/