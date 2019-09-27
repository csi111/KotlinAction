package co.kr.csi111.kotlininactionsample.chapter5

val sum = { x: Int, y: Int -> x + y }


fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses :  Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if(it.startsWith("4")) {
            clientErrors++
        } else if(it.startsWith("5")){
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}