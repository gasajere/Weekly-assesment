fun main() {
    println(lovedefine(4, 4))
    println(love(3,11))
    println(lovedefine(22,17))

}


fun lovedefine(flower1: Int, flower2: Int): Boolean {
    return if (flower1 % 2 == 0 && flower2 % 2 !== 0) {
        true
    } else flower1 % 2 !== 0 && flower2 % 2 == 0
}

//Best Practice
fun love(flowerA:Int, flowerB:Int):Boolean{
    return flowerA % 2 !== flowerB % 2; 
}

