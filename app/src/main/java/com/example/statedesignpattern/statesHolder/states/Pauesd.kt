package com.example.statedesignpattern.statesHolder.states

import android.util.Log
import com.example.statedesignpattern.statesHolder.AbstractState
import com.example.statedesignpattern.statesHolder.IMediaPlayer

class Pauesd : AbstractState {

    lateinit var player : IMediaPlayer
    constructor(mediaPlayer : IMediaPlayer): super(mediaPlayer){
        this.player = mediaPlayer
    }

    override fun playerDestroy() {
    }

    override fun playerCreate() {
    }

    override fun playerPrepared() {
    }

    override fun playerUnPrepared() {
        Log.d("stateMonetor" , "playerUnPrepared()")
        player.setCurrentState(Idel(player))
        Log.d("stateMonetor" , "Idel...")
    }

    override fun playerStart() {
        Log.d("stateMonetor" , "playerStart()")
        player.setCurrentState(Playing(player))
        Log.d("stateMonetor" , "Playing...")
    }

    override fun playerStop() {
        Log.d("stateMonetor" , "playerStop()")
        player.setCurrentState(Ready(player))
        Log.d("stateMonetor" , "Ready...")
    }

    override fun playerPaused() {
    }
}