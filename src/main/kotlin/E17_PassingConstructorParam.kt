open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, ${origin}에서 온 사자 왈: 으르렁!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "인도") // 1

fun main() {
    val lion: Lion = Asiatic("심바")                             // 2
    lion.sayHello()
}