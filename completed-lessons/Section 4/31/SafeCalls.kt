/*
    Lesson 31: SAfe Calls, Elvis Operator and Non-Null assertions
        NOTES:
        - `var?.length` = safe call `string | null`
        - `var!!.length` = double bang operator and throw exception if null (avoid using because of null pointers)
        - prefer safe calls `?.` or a null check
        - `var?.length ?: "Joey Missing"` = elvis operator if `var` is null it will revert
        (same as `var?.name ?? "Joey Missing"` in TS)
*/

fun main() {
    getName(name = "Joey")
    getName(name = null)
}

fun getName(name: String?) {
    println(name?.length ?: 0)
}
