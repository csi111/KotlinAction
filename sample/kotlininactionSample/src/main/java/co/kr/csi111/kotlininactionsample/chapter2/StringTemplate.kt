package co.kr.csi111.kotlininactionsample.chapter2

fun stringTemplate(arg: String): String = "Hello, ${if (arg.isNotEmpty()) arg else "Kotlin"}"