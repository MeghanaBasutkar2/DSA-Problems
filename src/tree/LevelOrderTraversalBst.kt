package tree

fun main() {

    val root = LevelOrderTraversalBst.Node(2)
    var tree = LevelOrderTraversalBst(root)
    tree.insertValue(6)
    tree.insertValue(7)
    tree.insertValue(12)
    tree.insertValue(11)
    tree.insertValue(32)
    tree.insertValue(14)
    tree.insertValue(4)

    tree.levelOrderTraversal()
}

class LevelOrderTraversalBst {

    var root: Node

    constructor(keyRoot: Node) {
        root = keyRoot
    }

    fun insertValue(key: Int) {
        insertInOrder(root, key)
    }

    fun insertInOrder(root: Node?, element: Int): Node? {
        if (root != null) {
            if (element < root.data) {
                root.left = insertInOrder(root.left, element)
            } else if (element > root.data) {
                root.right = insertInOrder(root.right, element)
            }
        } else {
            return Node(element)
        }
        return root
    }

    fun levelOrderTraversal() {

    }

    class Node(value: Int) {
        var left: Node? = null
        var right: Node? = null
        var data: Int = value
    }
}