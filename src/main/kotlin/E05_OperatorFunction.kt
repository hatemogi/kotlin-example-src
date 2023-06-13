fun main() {
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "하이 ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "웃어라! 온 세상이 너와 함께 웃을 것이다."
    println(str[0..3])                                           // 4
}