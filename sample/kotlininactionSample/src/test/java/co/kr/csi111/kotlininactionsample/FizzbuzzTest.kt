package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter2.fizzBuzz
import org.junit.Test

class FizzbuzzTest {

    @Test
    fun fizzbuzzTest() {
        for (i in 1..100) {
            val message = fizzBuzz(i)
            println(message)
            if (i % 15 == 0 || i % 3 == 0 || i % 5 == 0)
                assert(isFizzBuzz(i, message))
        }

        for (i in 100 downTo 1 step 2) {
            val message = fizzBuzz(i)
            println(message)
            if (i % 15 == 0 || i % 3 == 0 || i % 5 == 0)
                assert(isFizzBuzz(i, message))
        }

    }
}


fun isFizzBuzz(i: Int, message: String) = when {
    i % 15 == 0 && message == "FizzBuzz" -> true
    i % 3 == 0 && message == "Fizz" -> true
    i % 5 == 0 && message == "Buzz" -> true
    else -> false
}
