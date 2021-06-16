package `When expression`


fun main(){
    var temperature:Int=37
    var reaction=when{
        temperature>55->"It's too hot"
        temperature<20->"It's too cold"
        else -> "It's too cold"
    }
    println(reaction)
}