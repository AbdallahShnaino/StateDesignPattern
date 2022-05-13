package com.example.statedesignpattern.statesHolder.states

import android.util.Log
import com.example.statedesignpattern.statesHolder.AbstractState
import com.example.statedesignpattern.statesHolder.IMediaPlayer

class Ready : AbstractState {

    lateinit var player : IMediaPlayer
    constructor(mediaPlayer : IMediaPlayer):super(mediaPlayer){
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
        player.setCurrentState(Idel(palyer))
        Log.d("stateMonetor" , "Idel...")
    }

    override fun playerStart() {
        Log.d("stateMonetor" , "playerStart()")
        player.setCurrentState(Playing(player))
        Log.d("stateMonetor" , "Playing...")
    }

    override fun playerStop() {
    }

    override fun playerPaused() {
    }
}