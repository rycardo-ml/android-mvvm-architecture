package melo.example

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.OnLifecycleEvent
import melo.android.mvvm.MViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(): MViewModel() {

    private val mString: LiveData<String> = MutableLiveData()
    private val string: String = ""






    override fun onStart() {
        Log.d("MainViewModel", "start myViewModel")
    }

    override fun onStop() {
        Log.d("MainViewModel", "stop myViewModel")
    }

    override fun onDestroy() {
        Log.d("MainViewModel", "destroy myViewModel")
    }
}