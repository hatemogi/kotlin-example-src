fun main() {


    data class Person(val name: String, val city: String, val phone: String) // 1

    val people = listOf(                                                     // 2
        Person("석구", "서울", "02-1234-5678"),
        Person("성태", "부산", "051-234-9876"),
        Person("효리", "제주", "064-123-4567"),
        Person("상순", "제주", "064-234-8901"))

    val phoneBook = people.associateBy { it.phone }                          // 3
    val cityBook = people.associateBy(Person::phone, Person::city)           // 4
    val peopleCities = people.groupBy(Person::city, Person::name)            // 5
    val lastPersonCity = people.associateBy(Person::city, Person::name)      // 6


    println("전화번호부: $phoneBook")
    println("전화번호별 도시: $cityBook")
    println("도시별 사는 사람들: $peopleCities")
    println("각 도시에 사는 마지막 사람: $lastPersonCity")
}