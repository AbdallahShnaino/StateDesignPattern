package com.example.statedesignpattern.statesHolder

import android.util.Log
import com.example.statedesignpattern.statesHolder.states.Idel
import com.example.statedesignpattern.statesHolder.states.Ready

class StateMediaPlayer : IMediaPlayer {

    var player : IState? = null
    constructor(){
        this.setCurrentState( Idel(this) )
    }


    override fun destroy() {
        this.player!!.playerUnPrepared()
        this.player!!.playerDestroy()
    }

    override fun loadAlbum() {
        this.player!!.playerPrepared()
    }

    override fun stop() {
        this.player!!.playerStop()
    }

    override fun play() {
        this.player!!.playerStart()
    }

    override fun pause() {
        this.player!!.playerPaused()
    }

    override fun setCurrentState(state: IState?) {
        this.player = state
    }
}