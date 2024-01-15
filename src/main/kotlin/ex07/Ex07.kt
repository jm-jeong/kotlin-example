package org.example.ex07

fun main() {
    val user = User("홍길동", 10, "a@naver.com")
    println(user)

    val user1 = user.copy(name = "유관순")

    println(user1)
}