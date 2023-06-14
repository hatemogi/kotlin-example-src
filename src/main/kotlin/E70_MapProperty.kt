fun main() {
    class User(val map: Map<String, Any?>) {
        val name: String by map                // 1
        val age: Int     by map                // 1
    }
    val user = User(mapOf(
        "name" to "John Doe",
        "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")
}