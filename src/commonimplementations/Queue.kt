package commonimplementations

fun main() {
    var queue: Queue = Queue()
    queue.add(5)
    queue.add(15)
    queue.add(2)
    queue.add(4)
    queue.add(6)
    queue.add(8)
    print("\n")

    queue.remove()
    queue.remove()
    queue.remove()
    print("\n")

    queue.size()
    print("\n")

    queue.peek()
    print("\n")

    queue.getQueue()
}

class Queue {
    var arr: IntArray = IntArray(10)
    var first = -1
    var startIndex = 0

    fun size(): Int {
        print(first+1)
        return first+1
    }

    fun getQueue(): IntArray {
        for (i in 0..first)
            print(" ${arr[i]}")
        return arr
    }

    fun peek(): Int = arr[startIndex]

    // 6, 3, 2, 5, 8, 4
    //enqueue
    fun add(element: Int) {
        arr[++first] = element
        print(" ${arr[first]}")
    }

    fun remove() {
        print(" ${arr[startIndex++]}")
    }
}