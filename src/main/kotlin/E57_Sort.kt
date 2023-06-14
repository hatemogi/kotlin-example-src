import kotlin.math.abs

fun main() {

    val shuffled = listOf(5, 4, 2, 1, 3, -10)                   // 1
    val natural = shuffled.sorted()                             // 2
    val inverted = shuffled.sortedBy { -it }                    // 3
    val descending = shuffled.sortedDescending()                // 4
    val descendingBy = shuffled.sortedByDescending { abs(it)  } // 5

    println("무작위순: $shuffled")
    println("오름차순: $natural")
    println("오른차순 역순: $inverted")
    println("내림차순: $descending")
    println("절댓값의 내림차순: $descendingBy")
}