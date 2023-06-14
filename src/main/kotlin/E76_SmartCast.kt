import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

fun main() {
    val date: ChronoLocalDate? = LocalDate.now()    // 1

    if (date != null) {
        println(date.isLeapYear)                    // 2
    }

    if (date != null && date.isLeapYear) {          // 3
        println("윤년입니다!")
    }

    if (date == null || !date.isLeapYear) {         // 4
        println("올해에는 2월 29일이 없습니다...")
    }

    if (date is LocalDate) {
        val month = date.monthValue                 // 5
        println(month)
    }
}