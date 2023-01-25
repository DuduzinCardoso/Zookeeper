fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val present = readLine().toBoolean()

    if (invitation && present){
        print(true)
    }else{
        print(false)
    }
}