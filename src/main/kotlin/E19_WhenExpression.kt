fun main() {
    println(whenAssign("안녕"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "하나"                              // 2
        "안녕" -> 1                             // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

