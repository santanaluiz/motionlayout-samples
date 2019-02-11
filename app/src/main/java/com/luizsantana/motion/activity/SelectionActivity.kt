package com.luizsantana.motion.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.luizsantana.motion.R
import kotlinx.android.synthetic.main.activity_selection.*

class SelectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        layoutReference.setOnClickListener { startActivity(Intent(this, LayoutReferenceActivity::class.java)) }
        selfContained.setOnClickListener { startActivity(Intent(this, SelfContainedActivity::class.java)) }
        imageFilter.setOnClickListener { startActivity(Intent(this, ImageFilterActivity::class.java)) }
        keyframe.setOnClickListener { startActivity(Intent(this, KeyframeActivity::class.java)) }
        youtubeSample.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}
