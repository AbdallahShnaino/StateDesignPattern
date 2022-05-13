package com.example.statedesignpattern.statesHolder.states

import android.util.Log
import com.example.statedesignpattern.statesHolder.AbstractState
import com.example.statedesignpattern.statesHolder.IMediaPlayer

class Idel : AbstractState {
    lateinit var player : IMediaPlayer
    constructor(mediaPlayer : IMediaPlayer) : super(mediaPlayer){
        this.player = mediaPlayer
    }

    override fun playerDestroy() {
        Log.d("stateMonetor" , "playerDestroy()")
        player.setCurrentState(null)
    }

    override fun playerCreate() {
    }

    override fun playerPrepared() {
        Log.d("stateMonetor" , "playerPrepared()")
        player.setCurrentState(Ready(player))
        Log.d("stateMonetor" , "Ready...")
    }

    override fun playerUnPrepared() {
    }

    override fun playerStart() {
    }

    override fun playerStop() {
    }

    override fun playerPaused() {
    }
}