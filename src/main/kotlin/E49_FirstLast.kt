fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val first = numbers.first()                          // 2
    val last = numbers.last()                            // 3

    val firstEven = numbers.first { it % 2 == 0 }        // 4
    val lastOdd = numbers.last { it % 2 != 0 }           // 5

    println("숫자들: $numbers")
    println("처음은 $first, 마지막은 $last, 첫 짝수는 $firstEven, 마지막 홀수는 $lastOdd")
}