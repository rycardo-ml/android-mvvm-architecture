package melo.example

import android.app.Application
import melo.example.di.DaggerMyViewModelComponent
import melo.example.di.MyViewModelComponent

/**
 *
 * https://android.jlelse.eu/android-mvvm-with-dagger-2-retrofit-rxjava-architecture-components-6f5da1a75135
 * https://proandroiddev.com/advanced-data-binding-binding-to-livedata-one-and-two-way-binding-dae1cd68530f
 * https://medium.com/androiddevelopers/android-data-binding-library-from-observable-fields-to-livedata-in-two-steps-690a384218f2
 * https://medium.com/@soutoss/arquiteturas-em-android-mvvm-kotlin-retrofit-parte-1-2ac77c8a26
 * https://medium.com/android-dev-br/arquiteturas-em-android-mvvm-kotlin-android-architecture-components-databinding-lifecycle-d5e7a9023cf3
 * https://medium.com/@marco_cattaneo/android-viewmodel-and-factoryprovider-good-way-to-manage-it-with-dagger-2-d9e20a07084c
 */

class MainApp: Application() {

    companion object {
        lateinit var instance: MainApp
            private set
    }

    lateinit var myViewModelComponent: MyViewModelComponent
        private set

    override fun onCreate() {
        super.onCreate()

        instance = this

        initComponents()
    }

    private fun initComponents() {
        myViewModelComponent = DaggerMyViewModelComponent.builder().build()
    }
}