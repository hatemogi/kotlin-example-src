fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)                 // 1

    val evenOdd = numbers.partition { it % 2 == 0 }           // 2
    val (positives, negatives) = numbers.partition { it > 0 } // 3

    println("숫자들: $numbers")
    println("짝수: ${evenOdd.first}")
    println("홀수: ${evenOdd.second}")
    println("양수: $positives")
    println("음수: $negatives")
}