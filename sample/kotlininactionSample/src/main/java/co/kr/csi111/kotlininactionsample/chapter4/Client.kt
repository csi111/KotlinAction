package co.kr.csi111.kotlininactionsample.chapter4

data class Client(val name: String, val postalCode: Int) {

    fun copy() = Client(name, postalCode)
}