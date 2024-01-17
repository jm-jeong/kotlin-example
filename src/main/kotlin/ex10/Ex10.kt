package org.example.ex10


fun main() {
    val user = ExamUser(name = "ab")
    exam10(user)
}
fun exam10(examUser: ExamUser) {
    if (examUser.isNotNull() && examUser?.name.isNotNullOrBlank()) {
        println(examUser.name)
    }
}

data class ExamUser(
    var name: String? = null
)

fun String?.isNotNullOrBlank(): Boolean {
    return !this.isNullOrBlank()
}

fun Any?.isNotNull(): Boolean {
    return this != null
}

