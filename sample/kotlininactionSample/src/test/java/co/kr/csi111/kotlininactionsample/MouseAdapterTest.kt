package co.kr.csi111.kotlininactionsample

import co.kr.csi111.kotlininactionsample.chapter4.`object`.MouseAdapter
import co.kr.csi111.kotlininactionsample.chapter4.`object`.MouseEvent
import co.kr.csi111.kotlininactionsample.chapter4.`object`.Window
import org.junit.Test

class MouseAdapterTest {


    @Test
    fun addObjectTest() {
        val window: Window = Window()
        countClicks(window)
        assert(countClicks(window) > 0)
    }


    fun countClicks(window: Window): Int {
        var clickCount = 0

        window.setMouseListener(object : MouseAdapter {
            override fun mouseEntered(e: MouseEvent) {
            }

            override fun mouseClicked(e: MouseEvent) {
                clickCount++
            }
        })

        clickMouse(window)

        return clickCount
    }

    fun clickMouse(window: Window) {
        window.run {
            mouseAdapter.mouseClicked(object : MouseEvent {

            })
        }
   }
}