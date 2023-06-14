fun main() {

    val fruitsBag = listOf("사과", "오렌지", "바나나")             // 1
    val clothesBag = listOf("티셔츠", "양말", "청바지")            // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }                                // 4
    val flatMapBag = cart.flatMap { it }                        // 5

    println("장바구니 묶음: $mapBag")
    println("구매한 물품들: $flatMapBag")
}