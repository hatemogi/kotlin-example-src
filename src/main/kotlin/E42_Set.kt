val openIssues: MutableSet<String> =
    mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)                            // 2
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "잘 남겼습니다." else "중복 이슈입니다."      // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    val aNewIssueStat = getStatusLog(addIssue(aNewIssue))
    val anIssueAlreadyInStat = getStatusLog(addIssue(anIssueAlreadyIn))
    println("이슈 $aNewIssue $aNewIssueStat")                     // 4
    println("이슈 $anIssueAlreadyIn $anIssueAlreadyInStat")       // 5
}
