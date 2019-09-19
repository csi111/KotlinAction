package co.kr.csi111.kotlininactionsample.chapter4

class CopyClient(val name: String, val postalCode: Int) {

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) =
        CopyClient(name, postalCode)
}