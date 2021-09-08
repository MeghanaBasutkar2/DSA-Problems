package commonimplementations

fun main() {
    rotateTheArray(arrayOf(1,2,3,4,5), 2)
}

//3, 4, 5, 1, 2
fun rotateTheArray(array: Array<Int>, shift : Int) {
    val temp = IntArray(shift)
    for (i in 0 until shift){
        temp[i] = array[i]
//        print(" ${array[i]}")
    }
    //2
    //3, 4, 5, 4, 5
    for (i in shift until array.size){
        array[i - shift] = array[i]
//        print(" ${array[i]}")

    }
    //3, 4, 5, 1, 2
    for (i in 0 until temp.size){
        array[array.size-shift+i] = temp[i]
    }
    for (i in 0 until array.size){
        print(" ${array[i]}")
    }
}
