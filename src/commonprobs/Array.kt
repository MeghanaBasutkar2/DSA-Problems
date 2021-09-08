package commonprobs

fun main() {
    findLargest(listOf<Int>(3, 8, 10, 6))
    findSecondLargest(listOf<Int>(8, 8, 8))
    reverseArr(arrayOf(3, 8, 10, 6))
    removeDuplicates(arrayOf(1, 2, 2, 4, 5, 5, 9, 10, 12, 18, 18, 18))
    moveZeroesToEnd(arrayOf(1, 2, 5, 0, 2, 0, 5, 0))
}

fun moveZeroesToEnd(arrayOf: Array<Int>) {
    var swapIndex = 0
    for (i in arrayOf.indices) {
        if (arrayOf[i] != 0) {
            val arrCurrent = arrayOf[i]
            val arrZero = arrayOf[swapIndex]
            arrayOf[swapIndex] = arrCurrent
            arrayOf[i] = arrZero
            ++swapIndex
        }
    }
    print("\n zerooo--")
    for (i in arrayOf.indices)
        print(" ${arrayOf[i]}")
    print("\n")
}

fun removeDuplicates(list: Array<Int>) {
//    1, 2, 2, 4, 5, 5, 9, 10, 12, 18, 18, 18
    var res = 1
    var sizee = list.size
    for (i in 1 until sizee) {
        if (list[i] != list[res - 1]) {
            list[res] = list[i] // we assign current here and not prev based on the check. Hence we start with 1st index
            res++
        } else {
            sizee--
        }
    }
    for (i in 0..sizee - 1) {
        print("${list[i]} ")
    }
    print("-> duplicates removed & printed \n")
}


fun findLargest(arr: List<Int>): Pair<Int, Int> {
    var maxInt: Int = arr[0]
    var maxIndex = 0
    for (i in 1 until arr.size) {
        if (arr[i] > maxInt) {
            maxInt = arr[i]
            maxIndex = i
        }
    }
    println(maxInt)
    return maxInt to maxIndex
}

fun reverseArr(listt: Array<Int>) {
    //2, 4, 6, 8 , 10, 12
    var size = listt.size - 1
    for (i in 0..((listt.size - 1) / 2)) {
        var temp1 = listt[i]
        listt[i] = listt[size - i]
        listt[size - i] = temp1
    }
    print("rev")
    for (i in 0..listt.size - 1) {
        print(" ${listt[i]}")
    }
}

fun findSecondLargest(list: List<Int>): Pair<Int, Int> {
    var resultIndex = -1
    var secondLargest = list[0]
//    for - largest()
    //
    val largest = findLargest(list).first

    for (i in list.indices) {
        if (list[i] != largest) {
            if (resultIndex == -1 || (resultIndex != -1 && list[i] > secondLargest)) {
                resultIndex = i
                secondLargest = list[i]
            }
        }
    }
    println("$secondLargest $resultIndex")
    return secondLargest to resultIndex
}