package org.example.ex02

fun main() {
    val a: Int = 1
    val aa = 2
    val aaa: Int? = null

    callFunction(a)
    callFunction(aa)
    callFunction(aaa)
    callFunction()
}

fun callFunction(i: Int? = 100) {

    val temp = i?. let { it * 20 } ?: "null 값입니다."
    println(temp)
}