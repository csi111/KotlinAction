package co.kr.csi111.kotlininactionsample.chapter4.`object`

class Window {

    lateinit var mouseAdapter: MouseAdapter

    fun setMouseListener(adapter: MouseAdapter) {
        mouseAdapter = adapter
    }
}