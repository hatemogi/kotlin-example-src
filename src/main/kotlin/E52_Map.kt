fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)     // 1

    val doubled = numbers.map { x -> x * 2 }      // 2

    val tripled = numbers.map { it * 3 }          // 3

    println("숫자들: $numbers")
    println("두 배한 숫자들: $doubled")
    println("세 배한 숫자들: $tripled")
}