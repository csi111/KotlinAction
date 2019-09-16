package co.kr.csi111.kotlinaction

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import co.kr.csi111.kotlinaction.android.ChapterAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ChapterAdapter.OnClickItemListener {

    private lateinit var adapter: ChapterAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.layoutManager = LinearLayoutManager(this)
        adapter = ChapterAdapter()
        adapter.setClickListener(this)
        rv.adapter = adapter

    }

    override fun onClick(chapter: Chapter) {
        Toast.makeText(this, chapter.titleResource, Toast.LENGTH_LONG).show()
    }
}
