package co.kr.csi111.kotlininactionsample.chapter2

class Person(val name: String, var isMarried: Boolean) {
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person?, o2: Person?): Int {
            return o1?.name?.compareTo(o2?.name!!)!!
        }
    }
}