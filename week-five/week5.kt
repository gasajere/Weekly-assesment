fun removeVowels(words: String): String {
    var output = ""
    for (bcdh in words) {
        if (bcdh != 'A' && bcdh != 'a'
            && bcdh != 'E' && bcdh != 'e'
            && bcdh != 'I' && bcdh != 'i'
            && bcdh != 'O' && bcdh != 'o'
            && bcdh != 'U' && bcdh != 'u') {
            output +=bcdh
        }
    }
    return output
}

fun main() {
    println(removeVowels("Minato Namikaze the Yellow Flash"))
}