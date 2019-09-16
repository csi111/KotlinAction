package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter2.isLetter
import co.kr.csi111.kotlininactionsample.chapter2.isNotDigt
import org.junit.Test

class LetterTest {


    @Test
    fun letterTest() {
        assert(isLetter('q'))
        assert(isNotDigt('x'))
    }
}