package com.example.crackingthecodinginterview.vii_technical_questions.Optimize_And_Solve_Technique_No_3_Simplify_and_Generalize

/**
 * Created by Sargis Khlopuzyan, on 1/31/2020.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fcc.am)
 */

/**
 * Example: A ransom note can be formed by cutting words out of a magazine to form a new
 * sentence. How would you figure out if a ransom note (represented as a string) can be formed
 * from a given magazine (string)?
 * */

fun main() {

    val magazine = "Example: A ransom note can be formed by cutting words out of a magazine " +
            "to form a new sentence. How would you figure out if a ransom note (represented " +
            "as a string) can be formed from a given magazine (string)?"

    var ransomNote = "figure out a ransom note"

    val doesMagazineContainAllStrings = doesMagazineContainAllStrings(magazine, ransomNote)

    println("doesMagazineContainAllStrings: $doesMagazineContainAllStrings")
}

private fun doesMagazineContainAllStrings(magazine: String, ransomNote: String): Boolean {

    val magazineArray = convertTextToArray(magazine)
    val ransomNoteArray = convertTextToArray(ransomNote)

    val magazineHashMap = generateHashMapFromList(magazineArray)
    val ransomNoteHashMap = generateHashMapFromList(ransomNoteArray)

    println("$magazineArray")
    println("$ransomNoteArray")

    return checkIsCountsFromOneHashMapExistsInOtherOne(magazineHashMap, ransomNoteHashMap, ransomNoteArray)
}

private fun convertTextToArray(text: String): List<String> {

    val array = mutableListOf<String>()

    var string = ""
    for (c in text) {
        if (c == ' ' && string.isNotEmpty()) {
            array.add(string)
            string = ""
        } else {
            string += c
        }
    }

    if (string.isNotEmpty()) {
        array.add(string)
    }

    return array
}

private fun generateHashMapFromList(array: List<String>): HashMap<String, Int> {

    val hashMap = HashMap<String, Int>()

    for (str in array) {

        val count = hashMap[str]

        if (count == null) {
            hashMap[str] = 1
        } else {
            hashMap[str] = count + 1
        }
    }

    return hashMap
}

private fun checkIsCountsFromOneHashMapExistsInOtherOne(
    hashMapContainer: HashMap<String, Int>,
    hashMap: HashMap<String, Int>,
    keyArray: List<String>
): Boolean {

    for (key in keyArray) {

        val countInContainer = hashMapContainer[key]
        val count = hashMap[key]


        if (countInContainer == null || count == null || countInContainer < count) {
            return false
        }
    }

    return true
}