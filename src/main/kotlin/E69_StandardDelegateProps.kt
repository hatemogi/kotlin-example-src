class LazySample {
    init {
        println("created!")            // 1
    }

    val lazyStr: String by lazy {
        println("계산!")          // 2
        "지연 값"
    }
}

fun main() {
    val sample = LazySample()         // 1
    println("lazyStr = ${sample.lazyStr}")  // 2
    println(" = ${sample.lazyStr}")  // 3
}