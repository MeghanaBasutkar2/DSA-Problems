package commonprobs

import java.util.*

fun main() {
    var arr = arrayOf(3, 1, 9, 7, 6, 13, 2)
    rotateByD(2, arr)

    var str1 = "abcde"
    var str2 = "dbace"
    isPermuation(str1, str2)
}

fun isPermuation(str1: String, str2: String): Boolean {
    if (str1.length != str2.length) {
        return false
    }
   val s1 = str1.toSortedSet().toCharArray()
   val s2 = str2.toSortedSet().toCharArray()
    for (i in 0..str1.length) {
        if (s1[i] == s2[i])
            print("true")
        return true
    }
    return false
}

fun rotateByD(shiftBy: Int, arr: Array<Int>) {
    var temp = IntArray(shiftBy)
    for (i in 0..shiftBy - 1) {
        temp[i] = arr[i] //copies the array to be shifted in temp
    }
    for (i in shiftBy..arr.size - 1) { //iterates through rest of the array
        arr[i - shiftBy] = arr[i]  //starts inserting the elements from 0
    }
    for (i in 0..temp.size - 1) { //iterates through the temp array
        arr[arr.size - shiftBy + i] = temp[i] //assigns temp elements to existing
    }
    println()

    for (element in arr) {
        print(" $element")
    }
}
