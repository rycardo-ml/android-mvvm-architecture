package melo.example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import melo.android.mvvm.MViewModel
import javax.inject.Inject

class MyViewModel @Inject constructor(): MViewModel() {

    val mString: LiveData<String> = MutableLiveData()
    val string: String = ""


    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}