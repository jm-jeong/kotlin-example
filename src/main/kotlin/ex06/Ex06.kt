package org.example.ex06

fun main() {

    val dd = Dog("해피")
    dd.bark()
    dd.eat()
    println(dd.age)

    dd.age = 10
    println(dd.age)
}

interface Bark {
    fun bark()
}
interface Temp {
    fun haha()
}

abstract class Animal(
    private val name: String? = ""
) : Bark {
    fun eat() {
        println("$name 식사 시작합니다.")
    }
}


class Dog(
    private val name: String? = null
): Animal(name), Temp  {

    var age: Int? = 0
    override fun bark() {
        println("$name : 멍멍")
    }

    override fun haha() {
        TODO("Not yet implemented")
    }
}