enum class State {
    IDLE, RUNNING, FINISHED                           // 1
}

fun main() {
    val state = State.RUNNING                         // 2
    val message = when (state) {                      // 3
        State.IDLE -> "대기 중"
        State.RUNNING -> "실행 중"
        State.FINISHED -> "완료"
    }
    println(message)
}