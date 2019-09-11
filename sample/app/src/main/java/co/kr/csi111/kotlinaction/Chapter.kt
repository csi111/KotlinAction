package co.kr.csi111.kotlinaction

import androidx.annotation.StringRes

enum class Chapter(@StringRes val titleResource: Int) {
    CHAPTER2(R.string.chapter_2)
}