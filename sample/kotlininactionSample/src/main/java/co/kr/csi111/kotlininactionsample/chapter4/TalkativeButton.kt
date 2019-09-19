package co.kr.csi111.kotlininactionsample.chapter4

internal open class TalkativeButton : Focusable {

    private fun yell() = println("Hey!")
    protected fun whisper() = println("Lets talk!")
}


// Internal Error
//fun TalkativeButton.giveSpeech() {
//    yell()
//    whisper()
//}