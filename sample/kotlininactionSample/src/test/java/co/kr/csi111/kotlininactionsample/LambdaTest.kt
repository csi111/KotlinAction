package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter5.printMessagesWithPrefix
import co.kr.csi111.kotlininactionsample.chapter5.printProblemCounts
import co.kr.csi111.kotlininactionsample.chapter5.sum
import org.junit.Test

class LambdaTest {

    @Test
    fun lambdaTest() {


        val errors = listOf("403 Forbidden", "404 Not Found")
        val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")

        printProblemCounts(responses)
        printMessagesWithPrefix(errors, "Error : ")
        assert(sum(1, 2) == 3)

    }

}