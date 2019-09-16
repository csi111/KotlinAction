package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter2.binaryReps
import org.junit.Test

class BinaryRepsTest {

    @Test
    fun binaryRepsTest() {
        val binaryMap = binaryReps()


        for ((letter, binary) in binaryMap) {
            println("$letter = $binary")
            assert(binary == Integer.toBinaryString(letter.toInt()))
        }
    }
}
