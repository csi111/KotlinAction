package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter5.Person
import co.kr.csi111.kotlininactionsample.chapter5.findTheOldest
import org.junit.Test

class TheOldestTest {

    @Test
    fun addObjectTest() {
        val people = listOf(Person("Alice", 29), Person("Bob", 31))

        val oldest = findTheOldest(people)

        val oldestCompare = people.maxBy { it.age }

        val names = people.joinToString(separator = " ", transform = { it.name })
        println(names)
        assert(oldest == oldestCompare)
    }

}