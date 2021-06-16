package classes
fun main(){
    var cleaner:Paystructure= Paystructure(employee = "Cleaner",payment = 30000.500)
    var driver:Paystructure= Paystructure(employee = "Driver",payment =32000.500 )
    var secretary:Paystructure= Paystructure(employee = "Secretary",payment = 40000.500)
    var manager:Paystructure= Paystructure(employee = "Manager",payment = 150000.500)
    var supervisor:Paystructure= Paystructure(employee = "Supervisor",payment = 200000.500)
    supervisor.setemployee("Messenger")
    var employeeInfo:String=supervisor.getemployee()
    println(employeeInfo)
}
class Paystructure(var employee:String,var payment:Double){
    fun getemployee(): String {
        return this.employee
    }

    fun setemployee(employee: String) {
        this.employee = employee

    }

}
