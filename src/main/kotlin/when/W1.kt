fun main(){
    var dayOFweek ="Tuesday"
    var result:String= when{
        dayOFweek=="Monday"-> "Mobile development"
        dayOFweek=="Tuesday"->"UI/UX"
        dayOFweek=="Wednesday"->"Front end"
        else->"No program Today!!"
    }
    print(result)
}