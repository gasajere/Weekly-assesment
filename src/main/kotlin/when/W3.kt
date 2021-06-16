val name="Bob"
val greeting: String?=null

fun main(){
    val greetingToprint= when(greeting){
        null->"Hey"
        else-> greeting
    }
    println(greetingToprint)
    println(name)
}