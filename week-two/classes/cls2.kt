package classes
fun main(){
    var python:Programlanguage= Programlanguage(type = "Python",year = 1991)
    var ruby:Programlanguage= Programlanguage(type = "Ruby",year = 1990)
    ruby.settype("Java")
    var typeInfo:String=ruby.gettype()
    println(typeInfo)
    var fortran:Programlanguage= Programlanguage(type = "Fortran",year = 1950)
    var turing:Programlanguage= Programlanguage(type = "Turing",year = 1982)
    var kotlin:Programlanguage= Programlanguage(type = "Kotlin",year = 2010)

}

class Programlanguage(var type:String,var year:Int){
    fun gettype(): String {
        return this.type
    }

    fun settype(type: String) {
        this.type = type

    }

}