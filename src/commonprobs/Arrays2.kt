package commonprobs

fun main() {
    leftRotateArray(arrayOf(2, 3, 4, 6, 10, 12, 18, 0))
    findSumIndices(arrayOf(2, 12, 13, 18), 25)
    print("\n")
    findSumPair(arrayOf(2, 12, 13, 18), 25)
}

fun findSumPair(arrayOf: Array<Int>, sum: Int): Pair<Int, Int> {
    var pair = Pair(-1,-1)
    val map: HashMap<Int, Int> = HashMap()
    for (i in arrayOf.indices) {
        if (!(map.contains(arrayOf[i]))) { //check if this pair is already present
            map.put(arrayOf[i], sum - arrayOf[i])
        }
        map.forEach { key, value ->
            if (map.containsKey(value)) {
                 pair = Pair(key, sum-key)
            }
        }
    }
    println("pair: $pair")
    return pair
}

fun findSumIndices(arr: Array<Int>, sum: Int) {
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            val computedSum = arr[i] + arr[j]
            if (computedSum == sum) {
                if (i == 0) {
                    print("Only one element present & is = $sum")
                } else {
                    print("Your sub-array sum is between: $i & $j")
                }
            } else if (computedSum > sum) {
                break
            }
        }
    }
}

fun leftRotateArray(arr: Array<Int>) {
    var temp = arr[0]
    for (i in 1 until arr.size) {
        arr[i - 1] = arr[i]
    }
    arr[arr.size - 1] = temp
    print("left rotated array is: ")
    for (i in arr.indices) {
        print(" ${arr[i]}")
    }
    print("\n")
}
