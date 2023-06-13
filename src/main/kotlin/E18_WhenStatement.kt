fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("하나")                          // 2
        "안녕" -> println("인사")                      // 3
        is Long -> println("Long")                   // 4
        !is String -> println("문자열 아님")           // 5
        else -> println("그 외")                      // 6
    }
}

class MyClass