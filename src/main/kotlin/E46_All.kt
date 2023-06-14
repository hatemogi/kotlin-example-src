fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers.all { it % 2 == 0 }            // 2

    val allLess6 = numbers.all { it < 6 }                // 3

    println("숫자들: $numbers")
    println("모든 수가 짝수인가: $allEven")
    println("모든 수가 6보다 작은가: $allLess6")
}