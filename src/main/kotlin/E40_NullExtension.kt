fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1
fun main() {
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}