package co.kr.csi111.kotlininactionsample.chapter4

interface IUser {
    val email : String
    val nickname :  String
    get() = email.substringBefore('@')
}