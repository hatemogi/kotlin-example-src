fun main() {
    fun getNullableLength(ns: String?) {
        println("대상 \"$ns\":")
        ns?.run {                                                  // 1
            println("\t비었나? => " + isEmpty())                    // 2
            println("\t길이 => $length")
            length                                                 // 3
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("코틀린에서 어떤 문자열")
}