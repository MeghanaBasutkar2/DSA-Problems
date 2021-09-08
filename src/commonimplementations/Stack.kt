package commonimplementations

fun main() {
    var stack = Stack()
    stack.push(10)
    stack.push(12)
    stack.push(18)
    println("\n")

    stack.pop()
    stack.pop()
    stack.pop()
}
//  4 -> 3 -> 1 -> 2

class Stack {
    var topIndex: Int = -1
    var arr = IntArray(5)

    fun push(element: Int) {
        arr[++topIndex] = element
        print(" ${arr[topIndex]}")
    }

    fun pop() {
        print(" ${arr[topIndex--]}")
    }
}