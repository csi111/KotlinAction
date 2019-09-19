@file:JvmName("StringFunctions")

package co.kr.csi111.kotlininactionsample.chapter3.strings

//fun <T> joinToString(
//    collection: Collection<T>,
//    separator: String,
//    prefix: String,
//    postfix: String
//): String {
//    val result = StringBuilder(prefix)
//
//    for ((index, element) in collection.withIndex()) {
//        if (index > 0) result.append(separator)
//        result.append(element)
//    }
//
//    result.append(postfix)
//    return result.toString()
//}

fun String.lastChar(): Char = get(length - 1)


fun <T> Collection<T>.joinToString(
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}