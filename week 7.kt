fun main() {
    reverseArray(76869)
    reverseArray(3345)
}
fun reverseArray(num: Int) {
    var digit: Int = num
    val array = ArrayList<Int>()
    do {
        array.add(digit % 10)
        digit /= 10
    } while (digit > 0)
    println(array)
}