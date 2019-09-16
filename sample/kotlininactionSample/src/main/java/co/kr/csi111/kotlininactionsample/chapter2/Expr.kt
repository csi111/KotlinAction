package co.kr.csi111.kotlininactionsample.chapter2

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}

fun evalKotlin(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> evalKotlin(e.right) + evalKotlin(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}
