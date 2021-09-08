fun main() {
    //100..10 nos
    //go to a new line
    //upto 1
    var arr = IntArray(100)
    createSnakeAndL(arr)
}

/*
*
*
* */
fun createSnakeAndL(arr: IntArray) {
    var count = 0
    for (i in 100 downTo 1) {
        arr[count] = i
        print(arr[count])
        ++count
        if (count % 10 == 0)
            println()
    }
}