package melo.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import melo.android.mvvm.MFragment

class MainFragment: MFragment<MainViewModel>() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun injectFragment() {
        MainApp.instance.myViewModelComponent.inject(this)
    }

    override fun getViewModelClass(): Class<MainViewModel> {
        return MainViewModel::class.java
    }
}
