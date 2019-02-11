package com.luizsantana.motion.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.luizsantana.motion.R
import com.luizsantana.motion.activity.MainActivity
import com.luizsantana.motion.widget.SimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_video.*

class VideoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_video, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        videoRecyclerView.apply {
            adapter = SimpleAdapter(layoutResId = R.layout.detail_video_item_view)
            layoutManager = LinearLayoutManager(activity)
        }
        videoMotionLayout.addTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {
                val mainActivity = activity as MainActivity
                mainActivity.mainMotionLayout.progress = Math.abs(p3)
            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                Log.e("onTransitionCompleted ", "VideoFragment")
            }
        })
    }
}
