package co.kr.csi111.kotlininactionsample.chapter4

class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}