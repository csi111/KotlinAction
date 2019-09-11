package co.kr.csi111.kotlinaction.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import co.kr.csi111.kotlinaction.Chapter
import co.kr.csi111.kotlinaction.R
import kotlinx.android.synthetic.main.text_item.view.*

class ChapterAdapter() : RecyclerView.Adapter<ChapterAdapter.ChapterTextViewHolder>() {

    private var listener: OnClickItemListener? = null

    override fun onBindViewHolder(holder: ChapterTextViewHolder, position: Int) {
        holder.bind(Chapter.values()[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChapterTextViewHolder {
        return ChapterTextViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return Chapter.values().size
    }

    fun setClickListener(listener: OnClickItemListener) {
        this.listener = listener
    }


    inner class ChapterTextViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.text_item,
            parent,
            false
        )
    ) {
        fun bind(chapter: Chapter) {
            with(itemView) {
                setOnClickListener { listener?.onClick(chapter) }
                tv_title.setText(chapter.titleResource)
            }
        }
    }


    interface OnClickItemListener {
        fun onClick(chapter: Chapter)
    }

}