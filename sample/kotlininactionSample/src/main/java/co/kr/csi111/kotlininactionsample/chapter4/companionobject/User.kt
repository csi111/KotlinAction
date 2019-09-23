package co.kr.csi111.kotlininactionsample.chapter4.companionobject

class User private constructor(val nickname: String) {

    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))

        private fun getFacebookName(facebookAccountId: Int): String {
            return "FacebookId"
        }
    }


}