// You can experiment here, it won’t be checked

fun main() = print(List(readln().toInt()) { readln().toInt() }.count { it > 0 })
