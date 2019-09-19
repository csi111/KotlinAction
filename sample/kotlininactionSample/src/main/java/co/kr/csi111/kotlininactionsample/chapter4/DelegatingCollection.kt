package co.kr.csi111.kotlininactionsample.chapter4

class DelegatingCollection<T>(innerList: Collection<T> = ArrayList()) : Collection<T> by innerList {
}