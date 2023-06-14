fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val anyNegative = numbers.any { it < 0 }             // 2

    val anyGT6 = numbers.any { it > 6 }                  // 3

    println("숫자들: $numbers")
    println("0보다 작은 수가 있나: $anyNegative")
    println("6보다 큰 수가 있나: $anyGT6")
}