
fun main() {
    var password=checkPASSword("kryptonite")
    println(password)
}
fun checkPASSword (password:String):Boolean {
    if (password.length >= 8) {
        return true
    } else {
        return false
    }
}