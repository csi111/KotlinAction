package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter5.Person
import org.junit.Test

class CollectionLambdaTest {

    @Test
    fun collectionLambdaTest() {
        val list = listOf(1, 2, 3, 4)
        val evenNumberList = list.filter { it % 2 == 0 }
        val squaredNumberList = list.map { it * it }
        evenNumberList.forEach {
            assert(it % 2 == 0)
        }

        squaredNumberList.forEach {
            assert(it / it == 1)
        }


        val people = listOf(Person("Alice", 27), Person("Bob", 31))

        people.filter { it.age > 30 }.forEach {
            assert(it.age > 30)
        }

        val numbers = mapOf(0 to "zero", 1 to "one")

        numbers.mapValues { it.value.toUpperCase() }.forEach { entry ->
            entry.value.forEach { assert(it.isUpperCase()) }
        }

        val canBeInClub27 = { p: Person -> p.age <= 27 }

        assert(people.any(canBeInClub27))

    }

}