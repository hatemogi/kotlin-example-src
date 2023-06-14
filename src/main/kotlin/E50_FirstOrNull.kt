fun main() {

    val words = listOf("foo", "bar", "baz", "faz")         // 1
    val empty = emptyList<String>()                        // 2

    val first = empty.firstOrNull()                        // 3
    val last = empty.lastOrNull()                          // 4

    val firstF = words.firstOrNull { it.startsWith('f') }  // 5
    val firstZ = words.firstOrNull { it.startsWith('z') }  // 6
    val lastF = words.lastOrNull { it.endsWith('f') }      // 7
    val lastZ = words.lastOrNull { it.endsWith('z') }      // 8

    println("빈 리스트에 대해: 처음은 $first, 마지막은 $last")
    println("단어 리스트: 'f'로 시작하는 첫 아이템은 $firstF, 'z'로 시작하는 첫 아이템은 $firstZ")
    println("단어 리스트: 'f'로 끝나는 마지막 아이템은 is $lastF, 'z'로 끝나는 마지막 아이템은 $lastZ")
}