fun main(args: Array<String>) {

    val map = mapOf("키" to 42)

    val value1 = map["키"]                                     // 1
    val value2 = map["키2"]                                    // 2

    val value3: Int = map.getValue("키")                       // 1

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("키2")                // 3

    try {
        map.getValue("없는 키")                                 // 4
    } catch (e: NoSuchElementException) {
        println("메시지: $e")
    }


    println("value1 = $value1")
    println("value2 = $value2")
    println("value3 = $value3")
    println("value4 = $value4")
}