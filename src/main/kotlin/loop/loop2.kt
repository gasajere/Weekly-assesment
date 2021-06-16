

fun main() {
    //loop to print 1-10 without 3 and 4
    for (number in 1..10) {
        if (number == 4 && number == 5) {
            println(" ")
        } else if (number == 5) {
            println(" ")
        } else {
            println("$number")


        }
    }
}