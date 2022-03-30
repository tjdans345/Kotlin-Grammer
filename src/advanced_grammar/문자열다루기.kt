package advanced_grammar

import java.util.*

// 문자열 다루는 여러가지 방법
fun main() {
    val test ="Test.Kotlin.String"

    println(test.length)

    println(test.lowercase())
    println(test.uppercase())

    val test2 = test.split(".") // 자른 문자열을 배열로 반환
    println(test2)
    println(test2.get(0))
    println(test2[0])
    println(test2.joinToString()) // 배열을 한 문장으로 합쳐준다!
    println(test2.joinToString("-")) // 한 문장으로 합칠 때 인덱스 값들 사이에 넣을 문자

    print(test.substring(5..10))

    println("--------------------------------")
    println()

    val nullString: String? = null
    val emptyString = ""
    val blankString = " "
    val normalString = "a"

    // 변수들이 비어있는지 체크하는 함수들 중 편하게 사용할 수 있는 2가지
    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    println(nullString.isNullOrBlank());
    println(emptyString.isNullOrBlank());
    println(blankString.isNullOrBlank());
    println(normalString.isNullOrBlank());

    println("--------------------------------")
    println()

    val test3 = "kotlin.kt"
    val test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith("kt"))
    println(test4.endsWith("kt"))

    println(test3.contains("lin"))
    println(test4.contains("lin"))







}