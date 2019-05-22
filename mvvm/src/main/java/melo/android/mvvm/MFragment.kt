package melo.android.mvvm

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import melo.android.mvvm.dagger.ViewModelFactory
import javax.inject.Inject

const val TAG = "MFragment"
abstract class MFragment<MODEL: MViewModel>: Fragment()/*, LifecycleOwner*/ {

//    private var lifecycleRegistry = LifecycleRegistry(this)

    lateinit var model: MODEL

    @Inject
    lateinit var viewModeFactory: ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        injectFragment()
        model = ViewModelProviders.of(this, this.viewModeFactory).get(getViewModelClass())

        lifecycle.addObserver(model)

        Log.d(TAG, "instance " + this)
        Log.d(TAG, "factory " + viewModeFactory)
        Log.d(TAG, "created fragment model " + model)
    }

//    override fun getLifecycle(): Lifecycle {
//        return lifecycleRegistry
//    }

    abstract fun getViewModelClass(): Class<MODEL>
    abstract fun injectFragment()

}