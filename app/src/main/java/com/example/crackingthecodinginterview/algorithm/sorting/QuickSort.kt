package com.example.crackingthecodinginterview.algorithm.sorting

/**
 * Created by Sargis Khlopuzyan, on 1/30/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

fun main() {

    var array: Array<Int> = arrayOf(10, 80, 30, 90, 40, 50, 70)
    quickSort(array)
    println("array: ${array.toList()}")
}

fun quickSort(array: Array<Int>) {
    quickSort(
        array,
        0,
        array.size - 1
    )
}

fun quickSort(array: Array<Int>, lowIndex: Int, highIndex: Int) {

    if (lowIndex < highIndex) {

        var pivot =
            partition(
                array,
                lowIndex,
                highIndex
            )

        quickSort(
            array = array,
            lowIndex = lowIndex,
            highIndex = pivot - 1
        )
        quickSort(
            array = array,
            lowIndex = pivot + 1,
            highIndex = highIndex
        )
    }
}


fun partition(array: Array<Int>, lowIndex: Int, highIndex: Int): Int {

    var pivot = array[highIndex]
    var i = lowIndex - 1

    for (j in lowIndex until highIndex) {

        if (array[j] < pivot) {
            i++
            swap(
                array,
                i,
                j
            )
        }

    }

    swap(
        array,
        i + 1,
        highIndex
    )

    return i + 1
}

fun swap(array: Array<Int>, position1: Int, position2: Int) {
    var temp = array[position1]
    array[position1] = array[position2]
    array[position2] = temp
}