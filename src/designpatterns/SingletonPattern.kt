package designpatterns

fun main(args: Array<String>) {
//    var a = A()
    Singleton.printSingletonClassName()
}

/*
open class A {

    open fun printVarName() {
        print("I am in class printVarName")
    }

    init {
        println("I am in init of designpatterns.A")
    }
}
*/

object Singleton {

    init {
        println("designpatterns.Singleton class invoked.")
    }

    fun printSingletonClassName() {
        println("yes, get me----> ${this.javaClass.name}")
    }
}