fun main() {
    data class Person(var name: String, var age: Int, var about: String) {
        constructor() : this("", 0, "")
    }

    fun writeCreationLog(p: Person) {
        println("${p.name} 인스턴스를 만들었습니다.")
    }

    val jake = Person("Jake", 30, "안드로이드 개발자")      // 1
        .also {                                          // 2
            writeCreationLog(it)                         // 3
        }
}