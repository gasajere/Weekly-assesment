package classes
fun main() {
    var lion: Zoo = Zoo(name = "Lion", species = "Leo", idTag = 24)
    lion.setname("Cat")
    var nameInfo:String=lion.getname()
    println(nameInfo)
    var bear: Zoo = Zoo(name = "Bear", species = "Brown bear", idTag = 23)
    var tiger: Zoo = Zoo(name = "Tiger", species = "Tigris", idTag = 10)
    var snake: Zoo = Zoo(name = "Snake", species = "Mamba", idTag = 15)
    var monkey: Zoo = Zoo(name = "Monkey", species = "Chimpanzee", idTag = 8)
}


class Zoo(private var name:String,var species:String,var idTag:Int){
    fun getname(): String {
        return this.name
    }

    fun setname(name: String) {
        this.name = name

    }

}


