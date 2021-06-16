package classes
fun main(){
    var mango:Fruits= Fruits(name = "Mango",amount = 24)
    var peach:Fruits= Fruits(name = "Peach",amount = 10)
    var orange:Fruits= Fruits(name = "Orange",amount = 80)
    var apple:Fruits= Fruits(name = "Apple",amount = 20)
    apple.setname("Banana")
    var nameInfo:String=apple.getname()
    println(nameInfo)
    var pawpaw:Fruits= Fruits(name = "Pawpaw",amount = 10)
}
class Fruits(var name:String,var amount:Int){
    fun getname(): String {
        return this.name
    }

    fun setname(name: String) {
        this.name = name

    }

}


