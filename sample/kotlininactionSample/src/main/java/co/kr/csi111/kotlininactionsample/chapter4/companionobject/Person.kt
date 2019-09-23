package co.kr.csi111.kotlininactionsample.chapter4.companionobject

import org.json.JSONObject

class Person(val name: String) {
    companion object Loader {
//        fun fromJSON(jsonText: String): Person {
//            return Person(JSONObject(jsonText).optString("name"))
//        }
    }
}


fun Person.Loader.fromJSON(json : String) : Person = Person(json)