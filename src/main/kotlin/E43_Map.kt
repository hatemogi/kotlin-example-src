const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("업데이트 $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("에러: 계정이 없습니다 (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass 현황:")
    EZPassReport.forEach {                                                              // 5
            k, v -> println("ID $k: 포인트 $v")
    }
}

fun main() {
    accountsReport()                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)
    updatePointsCredit(5)                                                               // 8
    accountsReport()                                                                    // 9
}