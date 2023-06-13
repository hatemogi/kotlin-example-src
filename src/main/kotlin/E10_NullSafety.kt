fun main() {
    var neverNull: String = "이 변수는 null이 될 수 없습니다"    // 1

//    neverNull = null                                         // 2 - Null can not be a value of a non-null type String

    var nullable: String? = "이 변수는 null이 될 수 있습니다"    // 3

    nullable = null                                          // 4

    var inferredNonNull = "컴파일러 타입추론은 null-불가로 봅니다" // 5

//    inferredNonNull = null                                   // 6 - Null can not be a value of a non-null type String

    fun strLength(notNull: String): Int {                    // 7
        return notNull.length
    }

    strLength(neverNull)                                     // 8
//    strLength(nullable)                                      // 9 - Type mismatch: inferred type is Nothing? but String was expected
}