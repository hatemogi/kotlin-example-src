fun main() {

    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    println("숫자들: $numbers, 최소 = ${numbers.minOrNull()} 최대 = ${numbers.maxOrNull()}") // 1
    println("빈 리스트: $empty, 최소 = ${empty.minOrNull()}, 최대 = ${empty.maxOrNull()}")   // 2
    println("한개짜리: $only, 최소 = ${only.minOrNull()}, 최대 = ${only.maxOrNull()}")      // 3
}