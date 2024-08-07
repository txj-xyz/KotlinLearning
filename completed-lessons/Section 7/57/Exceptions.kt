/*
    Lesson 57: Exceptions
        NOTES:
        - Normal problem has enough information to cope with the issue
        - Exception = leave and delegate
*/

fun main() {
//    errorCode()
//    averageSalaryOrNull(amount = 3000, months = 0) // throws exception
//    println(averageSalaryOrNull(amount = 3000, months = 0))
    println(averageSalaryOrException(amount = 3000, months = 0))
}

// Straight exception since not a number
fun errorCode() {
    val invalidNumber = "#1"
    val result = invalidNumber.toInt()
}

// No safety checks
fun averageSalary(amount: Int, months: Int): Int {
   return amount / months
}

// `null else` = return null in the first `if()` otherwise process
fun averageSalaryOrNull(amount: Int, months: Int): Int? =
    if(amount == 0 || months == 0) null else amount / months

// Specify an actual argument exception instead of a generic Exception
fun averageSalaryOrException(amount: Int, months: Int): Int {
    if(amount == 0) {
        throw IllegalArgumentException("Invalid number passed for the 'amount' argument")
    } else if(months == 0) {
        throw IllegalArgumentException("Invalid number passed for the 'month' argument")
    } else {
        return amount / months
    }
}