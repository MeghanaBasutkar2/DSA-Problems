package commonprobs

fun main(){
    var arr = arrayOf(3,9,1,8,7)
    findLargestElement(arr)
    findSmallest(arr)
}

fun findLargestElement(arr: Array<Int>) {
    var max = arr[0]
    for (i in 1 until arr.size){
        if (arr[i]> max){
            max = arr[i]
        }
    }
    println(max)
}

fun findSmallest(arr: Array<Int>){
    var min: Int = arr[0]
    for(i in 1 until arr.size-1){
       if(arr[i] < min){
           min = arr[i]
       }
    }
    print("Smallest: $min")
}