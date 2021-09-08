package commonprobs

fun main() {
    moveZeroes(arrayOf(1, 3, 0, 8, 8, 0, 5, 5, 2, 0))
    sortArrayInDescendingOrder(arrayOf(1, 4, 2, 8, 6, 10, 12))
}

fun sortArrayInDescendingOrder(arrayOf: Array<Int>) {
    for (i in arrayOf.indices) {
        for (j in i + 1 until arrayOf.size) {
            if (arrayOf[i] < arrayOf[j]) {
                var temp = arrayOf[i]
                arrayOf[i] = arrayOf[j]
                arrayOf[j] = temp
            }
        }
    }
    println("donee.... ")
}

var swapIndex = 0
//1,0,3,4,0,0,8,1,2,0

fun moveZeroes(arr: Array<Int>) {
    for (i in arr.indices) {
        if (arr[i] != 0) {
            var current = arr[i]
            var swappingEl = arr[swapIndex]
            arr[swapIndex] = current
            arr[i] = swappingEl
            swapIndex++ //whenever we find a non-zero
        }
    }
}