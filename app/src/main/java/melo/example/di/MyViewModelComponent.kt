package melo.example.di

import dagger.Component
import melo.android.mvvm.dagger.ViewModelComponent
import melo.android.mvvm.dagger.ViewModelFactoryModule
import melo.example.MainActivity

@Component(modules = [ViewModelFactoryModule::class])
interface MyViewModelComponent: ViewModelComponent {

    fun inject(activity: MainActivity)

}
