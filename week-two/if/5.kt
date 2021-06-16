
fun main(){
    println("Enter number of boys:")
    var boys= readLine()!!.toInt()
    println("Enter number of girls:")
    var girls= readLine()!!.toInt()
    println("Enter number of Teachers:")
    var teachers= readLine()!!.toInt()
    val school= readLine()

    if(boys+girls/30>=teachers){
        print("School has enough teachers")
    }else{
        print("Teachers are understaffed")
    }

}