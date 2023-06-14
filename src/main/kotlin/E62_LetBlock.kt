fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
    val empty = "test".let {               // 1
        customPrint(it)                    // 2
        it.isEmpty()                       // 3
    }
    println(" 비었나: $empty")


    fun printNonNull(str: String?) {
        println("\"$str\" 프린트:")

        str?.let {                         // 4
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->       // 5
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("문자열")
    printIfBothNonNull("첫번째", "두번째")
}