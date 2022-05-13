package com.example.statedesignpattern.statesHolder

interface IMediaPlayer {
    public fun destroy ()
    public fun loadAlbum ()
    public fun stop ()
    public fun play ()
    public fun pause ()
    public fun setCurrentState ( state : IState?)
}