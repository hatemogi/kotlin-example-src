fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val allEven = numbers.none { it % 2 == 1 }           // 2

    val allLess6 = numbers.none { it > 6 }               // 3

    println("숫자들: $numbers")
    println("모든 수가 짝수인가: $allEven")
    println("6보다 큰 수가 없나: $allLess6")
}