fun main() {

    val words = listOf("컬렉션에", "있는", "어떤", "아이템", "골라서", "찾기")           // 1

    val first = words.find { it.startsWith("아이") }                                // 2
    val last = words.findLast { it.startsWith("아이") }                             // 3

    val nothing = words.find { it.contains("없는") }                                // 4

    println("\"아이\"로 시작하는 첫번째 단어는 \"$first\"입니다.")
    println("\"아이\"로 시작하는 마지막 단어는 \"$last\"입니다.")
    println("\"없는\"을 포함한 단어는 ${nothing?.let { "\"$it\"" } ?: "null"}입니다.")
}