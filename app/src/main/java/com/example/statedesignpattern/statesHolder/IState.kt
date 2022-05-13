package com.example.statedesignpattern.statesHolder

interface IState {
    public fun playerDestroy ()
    public fun playerCreate ()
    public fun playerPrepared ()
    public fun playerUnPrepared ()
    public fun playerStart ()
    public fun playerStop ()
    public fun playerPaused ()
}