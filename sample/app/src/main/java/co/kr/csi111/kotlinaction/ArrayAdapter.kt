package co.kr.csi111.kotlinaction

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.ArrayRes
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.text_item.view.*

class ArrayAdapter(val context: Context, private val objects: List<String>) :
    RecyclerView.Adapter<ArrayAdapter.TextViewHolder>() {

    constructor(context: Context, @ArrayRes resource: Int) : this(
        context,
        context.resources.getStringArray(resource).toList()
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        return TextViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return objects.size
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.bind(objects[position])
    }


    inner class TextViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.text_item,
            parent,
            false
        )
    ) {
        fun bind(title: String) {
            with(itemView) {
                setOnClickListener {  }
                tv_title.text = title
            }
        }
    }
}