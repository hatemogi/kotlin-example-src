fun main() {
    val x = 2
    if (x in 1..5) {            // 1
        print("x는 1에서 5 사이의 수")
    }
    println()

    if (x !in 6..10) {          // 2
        print("x는 6에서 10 사이의 수가 아님")
    }
}