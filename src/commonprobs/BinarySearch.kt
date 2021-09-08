package commonprobs

fun main() {
    binarysearch(arrayOf(1, 2, 3, 8, 10, 12), 10)
    binarysearchByRecursion(arrayOf(1, 2, 3, 8, 10, 12), 10, 0, 5)
}

fun binarysearchByRecursion(input: Array<Int>, eleToSearch: Int, low: Int, high: Int): Int {
    if(low>high){
        return -1
    }
    if(low <=high) {
        val mid = (low+((high-low)/2))
        when {
            eleToSearch > input[mid] -> return binarysearchByRecursion(
                input,
                eleToSearch,
                mid + 1,
                high
            )   // element is greater than middle element of array, so it will be in right half. Recursion will call the right half again
            eleToSearch < input[mid] -> return binarysearchByRecursion(
                input,
                eleToSearch,
                low,
                mid - 1
            )    //element is less than middle element of array, so it will be in left half of the array. Recursion will call the left half again.
            eleToSearch == input[mid] -> {println(mid)
                return mid }// element found.
        }
    }
    return -1
}

fun binarysearch(input: Array<Int>, eleToSearch: Int): Int {
    var low = 0
    var high = input.size - 1
    var mid: Int
    while (low <= high) {
        mid = low + ((high - low) / 2)
        when {
            eleToSearch > input[mid] -> low = mid + 1
            eleToSearch < input[mid] -> high = mid - 1
            eleToSearch == input[mid] -> {
                println(mid)
                return mid
            }
        }
    }
    print(-1)
    return -1
}

