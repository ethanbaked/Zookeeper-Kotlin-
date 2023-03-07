fun main() {
    // put your code here
    var larger = 0
    var smaller = 0
    var perfect = 0
    val n = readln().toInt()

    repeat(n) {
        val next = readln().toInt()
        if (next > 0) {
            larger++
        } else if (next < 0) {
            smaller++
        } else {
            perfect++
        }
    }

    println("$perfect $larger $smaller")

}