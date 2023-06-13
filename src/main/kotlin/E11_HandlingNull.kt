fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "문자열 길이: ${maybeString.length}"
    } else {
        return "빈 문자열이거나 null입니다"                         // 3
    }
}

fun main() {
    println(describeString(null))
}