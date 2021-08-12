package com.example.manyiiii

import android.graphics.Typeface
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

public class MainActivity : AppCompatActivity() {
    lateinit var manyi: AppCompatButton
    lateinit var sub: TextView
    lateinit var mp: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        manyi = findViewById(R.id.TVan)
        sub = findViewById(R.id.subheadingTV)
        manyi.typeface = Typeface.createFromAsset(assets, "fonts/earwig.ttf")
        sub.typeface = Typeface.createFromAsset(assets, "fonts/Bohemian Typewriter.ttf")
        mp = MediaPlayer.create(this, R.raw.fever)
        manyi.setOnClickListener{
            sound()
        }

    }

    fun sound() {
        val mp: MediaPlayer = MediaPlayer.create(applicationContext,
            R.raw.fever
        )
        mp.start()
    }
}
