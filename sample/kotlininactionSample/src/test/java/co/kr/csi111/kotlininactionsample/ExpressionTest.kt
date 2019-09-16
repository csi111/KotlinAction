package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter2.Num
import co.kr.csi111.kotlininactionsample.chapter2.Sum
import co.kr.csi111.kotlininactionsample.chapter2.eval
import co.kr.csi111.kotlininactionsample.chapter2.evalKotlin
import org.junit.Test

class ExpressionTest {

    @Test
    fun sumTest() {
        assert(evalKotlin(Sum(Sum(Num(1), Num(2)), Num(4))) == 7)
        assert(eval(Sum(Sum(Num(1), Num(2)), Num(4))) == 7)
    }
}