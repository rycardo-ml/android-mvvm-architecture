package melo.android.mvvm

import androidx.lifecycle.*

abstract class MViewModel: ViewModel(), LifecycleObserver {

    //data to be observed/kept

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    abstract fun onStart()

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    abstract fun onStop()

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    abstract fun onDestroy()
}