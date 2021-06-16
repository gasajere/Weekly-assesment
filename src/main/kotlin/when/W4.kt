val name2="Bob"
var response: String?=null

fun main(){
    response="Howdy"
    val greetingToprint= when(response){
        null->"Hey"
        else-> response
    }
    println(greetingToprint)
    println(name2)
}