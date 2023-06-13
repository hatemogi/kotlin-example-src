sealed class Mammal(val name: String)                                          // 1

class Cat(val catName: String) : Mammal(catName)                               // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                            // 3
        is Human ->
            return "안녕하세요, ${mammal.name}님. 직업은 ${mammal.job}이군요."      // 4
        is Cat ->
            return "안녕 ${mammal.name}"                                        // 5
    }                                                                          // 6
}

fun main() {
    println(greetMammal(Cat("Snowy")))
}