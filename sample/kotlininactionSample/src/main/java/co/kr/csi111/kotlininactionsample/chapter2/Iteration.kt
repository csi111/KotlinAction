package co.kr.csi111.kotlininactionsample.chapter2

import java.util.*

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}


fun binaryReps(): TreeMap<Char, String> {
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    return binaryReps
}


fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'


fun isNotDigt(c: Char) = c !in '0'..'9'