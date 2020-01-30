package com.example.crackingthecodinginterview.vi_big_o

/**
 * Created by Sargis Khlopuzyan, on 1/29/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {
    val a = arrayOf(6, 9, 2, 5, 4, 2)
    val b = arrayOf(1, 2, 5, 6, 3, 2)

    intersection_VI_12(a, b)
}

fun intersection_VI_12(a: Array<Int>, b: Array<Int>) {

    var insertion = 0

    println("b: ${b.asList()}")
//    bubbleSort_VI_12(b)
    quickSort_VI_12(b)
    println("b: ${b.asList()}")

    for (i in a) {

        if (binarySearch_vi_12(b, i) >= 0) {
            insertion++
        }

    }

    println("insertion: $insertion")
}

// Quick Sort

fun quickSort_VI_12(arr: Array<Int>) {
    quickSort_VI_12(arr, 0, arr.size - 1)
}

fun quickSort_VI_12(arr: Array<Int>, lowIndex: Int, highIndex: Int) {

    if (lowIndex < highIndex) {

        val partitionIndex = partition_vi_12(arr, lowIndex, highIndex)
        quickSort_VI_12(arr, lowIndex, partitionIndex - 1)
        quickSort_VI_12(arr, partitionIndex + 1, highIndex)

    }

}

fun partition_vi_12(arr: Array<Int>, lowIndex: Int, highIndex: Int): Int {

    var pivot = arr[highIndex]

    var i = lowIndex - 1

    for (j in lowIndex until highIndex) {

        if (arr[j] < pivot) {
            i++
            swap_vi_12(arr, i, j)
        }
    }

    swap_vi_12(arr, i + 1, highIndex)

    return i + 1
}

// Bubble Sort

fun bubbleSort_vi_12(b: Array<Int>) {

    for (i in 0 until b.size - 1) {

        for (j in i + 1 until b.size) {

            if (b[i] > b[j]) {

                swap_vi_12(b, i, j)

            }
        }
    }
}

// Swap

fun swap_vi_12(arr: Array<Int>, pos1: Int, pos2: Int) {

    if (pos1 == pos2) {
        return
    }

    var t = arr[pos1]
    arr[pos1] = arr[pos2]
    arr[pos2] = t
}

// Binary Search

fun binarySearch_vi_12(b: Array<Int>, value: Int): Int {
    return binarySearch_vi_12(b, value, 0, b.size - 1)
}

fun binarySearch_vi_12(array: Array<Int>, value: Int, startIndex: Int, endIndex: Int): Int {

    val midIndex = (startIndex + endIndex) / 2

    if (startIndex > endIndex) {
        return -1
    }

    return when {

        array[midIndex] == value -> {
            midIndex
        }

        array[midIndex] < value -> {
            binarySearch_vi_12(array, value, midIndex + 1, endIndex)
        }

        else -> {
            binarySearch_vi_12(array, value, startIndex, midIndex - 1)
        }

    }

}