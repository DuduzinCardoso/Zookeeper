fun main() { // coloque seu código aqui
    val value1: Int = readln().toInt()
    val value2: Int = readln().toInt()
    val value3: Int = readln().toInt()
    val inRange = value3 >= value2 && value1 <= value3 && value2 <= value3 || value3 <= value1 && value2 >= value1
    println(inRange)
}
