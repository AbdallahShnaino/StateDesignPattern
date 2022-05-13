package com.example.statedesignpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.statedesignpattern.statesHolder.StateMediaPlayer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var load = findViewById<Button>(R.id.load)
        var play = findViewById<Button>(R.id.play)
        var stop = findViewById<Button>(R.id.stop)
        var pause = findViewById<Button>(R.id.pause)

        var state = StateMediaPlayer()
        load.setOnClickListener {
            state.loadAlbum()
        }
        play.setOnClickListener {
            state.play()
        }
        stop.setOnClickListener {
            state.stop()
        }
        pause.setOnClickListener {
            state.pause()
        }
    }
}