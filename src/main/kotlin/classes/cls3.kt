package classes
fun main(){
    var okeke:Teacher= Teacher(name = "Okeke",noOFsubject = 3)
    var chika:Teacher= Teacher(name = "Chika",noOFsubject =2)
    var donald:Teacher= Teacher(name = "Donald",noOFsubject = 1)
    donald.setname("Mike")
    var nameInfo:String=donald.getname()
    println(nameInfo)
    var prince:Teacher= Teacher(name = "Prince",noOFsubject = 2)
    var Emma:Teacher= Teacher(name = "Emma",noOFsubject = 0)
}


class Teacher(var name:String,var noOFsubject:Int){
    fun getname(): String {
        return this.name
    }

    fun setname(name: String) {
        this.name = name

    }

}


