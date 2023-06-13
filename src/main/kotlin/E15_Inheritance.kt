open class Dog {                // 1
    open fun sayHello() {       // 2
        println("멍멍!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("왈왈!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}