open class Tiger(val origin: String) {
    fun sayHello() {
        println("${origin}의 타이거 왈: 어흥!")
    }
}

class SiberianTiger : Tiger("시베리아")                  // 1

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}