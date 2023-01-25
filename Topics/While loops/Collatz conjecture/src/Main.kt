fun main() {
    var number = readln().toInt()
    while (number >= 1){
        print("$number ")
        if(number == 1){
            break
        }
        else if (number % 2 == 0){
            number /= 2
        }
        else if (number % 2 != 0){
            number = (number * 3) + 1
        }
    }
}