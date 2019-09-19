package co.kr.csi111.kotlininactionsample.chapter4

open class User constructor(val nickname: String, val isSubscribed: Boolean = true) {
    var address: String = "unspecified"
        set(value) {
            println("""Address was changed for $nickname: "$field" -> "$value".""".trimIndent())
            field = value
        }


}