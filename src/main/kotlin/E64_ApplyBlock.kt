fun main() {
    data class Person(var name: String, var age: Int, var about: String) {
        constructor() : this("", 0, "")
    }
    val jake = Person()                                     // 1
    val stringDescription = jake.apply {                    // 2
        name = "Jake"                                       // 3
        age = 30
        about = "안드로이드 개발자"
    }.toString()                                            // 4
    println(stringDescription)
}