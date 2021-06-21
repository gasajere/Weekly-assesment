fun main(){
    println(invert("Goodfood"))
}
fun invert(str:String):String{
    var reverse=""
    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
    return reverse
}
