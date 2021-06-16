

fun main() {
    // odd even loop
    var odd: Array<Int> = arrayOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    var even: Array<Int> = arrayOf(30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40)
    for (odd in odd) {
        if (odd % 2 == 0) {
            println(odd)
        } else {
            for (x in even) {
                if (x % 2 != 0) {
                    println(x)
                }
            }
        }
    }
}