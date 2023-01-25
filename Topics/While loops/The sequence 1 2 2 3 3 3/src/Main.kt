import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n: Int = scanner.nextInt()
    var i: Int = 0
    while (n > 0) {
        i ++
        repeat(if (i > n) n else i) { print("$i ") }
        n -= i
    }
}
