package org.example.ex09

fun main() {
    val result = when ("Admin") {
        "" -> ""
        "Master", "Admin" -> {
            "master"
        }
        "User" -> {
            "user"
        }
        else -> {
            "default"
        }
    }
    println(result)

    var exception = RuntimeException()
    when (exception) {
        is NullPointerException -> {

        }
        is NoSuchElementException -> {

        }
    }
}