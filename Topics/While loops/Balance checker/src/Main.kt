import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var isEmpty = true
    while (scanner.hasNextInt()) {
        var next = scanner.nextInt()
        if (balance >= next) {
            balance -= next
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $next.")
            isEmpty = false
        }
    }
    if (isEmpty) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }
}