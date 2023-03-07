fun main() {
    // put your code here
    val input1 = readln().toInt()
    val input2 = readln().toInt()
    val input3 = readln().toInt()

    val isDifferent = (input1 != input2) && (input2 != input3) && (input3 != input1)
    println(isDifferent)
}