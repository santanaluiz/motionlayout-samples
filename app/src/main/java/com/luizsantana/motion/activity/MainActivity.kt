package com.luizsantana.motion.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.luizsantana.motion.R
import com.luizsantana.motion.fragment.VideoFragment
import com.luizsantana.motion.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_video.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.container, VideoFragment())
                    .commit()
        }
        recyclerview.apply {
            adapter = SimpleAdapter(View.OnClickListener {
                val videoFragment = supportFragmentManager.findFragmentById(R.id.container) as VideoFragment
                videoFragment.videoMotionLayout.transitionToEnd()
            }, layoutResId = R.layout.main_videos_item_view)
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

    }
}
