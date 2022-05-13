package com.example.statedesignpattern.statesHolder

abstract class AbstractState : IState {
    lateinit var palyer : IMediaPlayer
    constructor( mediaPlayer : IMediaPlayer){
        this.palyer = mediaPlayer
    }

}