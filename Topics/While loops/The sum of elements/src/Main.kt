import java.util.Scanner
fun main() {
    var count = 0
    var i = 0
    val scanner = Scanner(System .`in`)
    while (scanner.hasNextInt()) {
        var next = scanner.nextInt()
        if (next == 0) {
            break
        }
        count += next
    }
    print(count)
}
