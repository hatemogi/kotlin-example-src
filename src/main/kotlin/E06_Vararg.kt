fun main() {
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "안녕",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}