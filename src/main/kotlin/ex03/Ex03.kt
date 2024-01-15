package org.example.ex03

fun main() {

    var list = mutableListOf<User>()
    list.add(User("a", 1))
    list.add(User("b", 2))
    list.add(User("c", 3))

    for (l in list) {
        println(l)
    }

    list.forEach { it -> println(it) }

    list.forEachIndexed { index, user ->
        println("index: $index user:${user.name}")
    }

}

class User(
    var name: String,
    var age: Int
)