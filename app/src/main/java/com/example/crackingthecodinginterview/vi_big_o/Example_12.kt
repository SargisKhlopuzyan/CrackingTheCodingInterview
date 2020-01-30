package com.example.crackingthecodinginterview.vi_big_o

fun main() {

    var string = "abcd"
    permutation_12(string, "")

}

fun permutation_12(str: String, prefix: String) {
    if (str.isEmpty()) {
        println("****************** $prefix")
    } else {
        for (i in str.indices) {
            var rem = str.substring(0, i) + str.substring(i + 1)
//            println("rem: $rem, prefix : $prefix, str[i]: ${str[i]}")
            println("rem: $rem, prefix + str[i]: ${prefix + str[i]}")
            permutation_12(
                rem,
                prefix + str[i]
            )
        }
    }
}