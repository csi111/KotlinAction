package co.kr.csi111.kotlininactionsample.chapter4

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}