package org.example.ex11

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


fun main() {
    UserDto(name = "홍길동").let {
        logic(it)
    }

    val dto = UserDto(
        name = "홍길"
    )?.also { userDto: UserDto ->
        println(userDto)

        userDto.name = "미미"
    }
    println("result $dto")

    val user = UserDto().apply {
        this.name = "홍홍"
        name = "길길"
    }

    val now: LocalDateTime?= null

    val n = now?.let { it }?: LocalDateTime.now()

    println("result $n")

    val d = now?.let {
        val minusTime = it.minusHours(1)
        minusTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"))
    }?: run {
        val now = LocalDateTime.now()
        val minusTime = now.minusHours(2)
        minusTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
    }

    println("result $d")

}
fun logic(userDto: UserDto?): UserResponse? {
    return userDto?.let { userDto ->
        println("dto $userDto")
        UserEntity(
            name = userDto.name
        )
    }?.let { userEntity ->
        println("entity $userEntity")
        UserResponse(
            name = userEntity.name
        )
    }
}

data class UserDto(
    var name: String? = null
)

data class UserEntity(
    var name: String? = null
)

data class UserResponse(
    var name: String? = null
)