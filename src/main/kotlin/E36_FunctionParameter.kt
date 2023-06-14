fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun add(x: Int, y: Int) = x + y                                     // 3

fun main() {
    val addResult = calculate(4, 5, ::add)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $addResult, mulResult $mulResult")
}