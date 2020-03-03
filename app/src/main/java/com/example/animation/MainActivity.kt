package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.animation.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clockwise(view:View){
        val image = findViewById(R.id.imageView) as ImageView
        val animation= AnimationUtils.loadAnimation(applicationContext,
            R.anim.clockwise
        )
        image.startAnimation(animation)
    }
    fun zoom(view:View){
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 =AnimationUtils.loadAnimation(applicationContext,
            R.anim.zoom
        )
        image.startAnimation(animation1)
    }

    fun blink(view:View){
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 =AnimationUtils.loadAnimation(applicationContext,
            R.anim.blink
        )
        image.startAnimation(animation1)
    }

    fun fade(view:View){
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 =AnimationUtils.loadAnimation(applicationContext,
            R.anim.fade
        )
        image.startAnimation(animation1)
    }

    fun slide(view:View){
        val image = findViewById(R.id.imageView) as ImageView
        val animation1 =AnimationUtils.loadAnimation(applicationContext,
            R.anim.slide
        )
        image.startAnimation(animation1)
    }
}
