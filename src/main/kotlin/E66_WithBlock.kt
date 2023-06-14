class Configuration(var host: String, var port: Int)

fun main() {
    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")       // 1
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")
}