fun main() {

    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1

    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("전체 아이템 갯수: $totalCount")
    println("짝수 갯수: $evenCount")
}