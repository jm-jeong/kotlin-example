package org.example.ex04

fun main() {
    val map = mapOf<String, Any>(
        Pair("key", "value"),
        "key1" to "value"
    )

    val mutableMap = mutableMapOf<String, Any>(
        "key" to "value"
    )
    mutableMap["key1"] = "value1"
    mutableMap["key2"] = "value2"

    val hashMap = hashMapOf<String, Any>()

    var triple = Triple<String, String, String>(
        first = "f",
        second = "s",
        third = "t"
    )
}