package co.kr.csi111.kotlininactionsample.chapter2

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxExpression(a: Int, b: Int) = if (a > b) a else b


