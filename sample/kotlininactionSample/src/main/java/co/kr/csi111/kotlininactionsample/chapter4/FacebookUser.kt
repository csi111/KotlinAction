package co.kr.csi111.kotlininactionsample.chapter4

class FacebookUser(val accountId: Int) : IUser {
    override val email: String = getFacebookAccountEmail(accountId)

    private fun getFacebookName(accountId: Int): String = ""
    private fun getFacebookAccountEmail(accountId: Int): String = ""

}