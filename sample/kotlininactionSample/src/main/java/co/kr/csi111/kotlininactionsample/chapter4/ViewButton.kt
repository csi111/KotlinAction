package co.kr.csi111.kotlininactionsample.chapter4

class ViewButton : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}

    class ButtonState : State {}
}