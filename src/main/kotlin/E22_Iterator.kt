class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("얼룩말"), Animal("사자")))

    for (animal in zoo) {                                   // 3
        println("여기 ${animal.name} 있어요!")
    }

}