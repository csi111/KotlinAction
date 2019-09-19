package co.kr.csi111.kotlininactionsample.chapter3

const val UNIX_LINE_SEPARATOR = "\n" //static final

var opCount = 0 //static


var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }
