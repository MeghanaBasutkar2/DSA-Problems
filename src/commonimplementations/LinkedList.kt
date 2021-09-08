package commonimplementations

//todo: complete it
class LinkedList {
    var head: Node? = null

    fun add(element: Int) {
        if (head == null) {
            head = Node(element)
            head!!.next = null
        } else if (head != null) {
            val newnode = Node(element)
            newnode.next = head
        }
    }

    class Node {
        var data: Int? = null
        var next: Node? = null

        constructor(element: Int) {
            data = element
        }
    }
}