package org.example.ex05

fun main() {

    var numberList = listOf<Int>(1, 2, 3, 4, 5)
    numberList.filter { it % 2 == 0 }
    println(numberList)

    val dinnerList = listOf("Pizza", "Risotto", "Pasta", "Hamburger")
    val filteredList = dinnerList.filter {
        it.startsWith("P")
    }

    println(dinnerList)
    println(filteredList)

    val add = {
        x: Int, y:Int -> x+y
    }
    println(add(3,4))

    lambda(4, 5, add)


}
fun lambda(x: Int, y: Int, method: (Int, Int) -> Int) {
    println(method(x,y))
}