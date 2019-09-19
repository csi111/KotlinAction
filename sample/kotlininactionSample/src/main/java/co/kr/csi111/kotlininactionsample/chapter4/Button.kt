package co.kr.csi111.kotlininactionsample.chapter4

class Button : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

    override fun click() {
        println("I was clicked")
    }
}