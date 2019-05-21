package melo.android.mvvm.dagger

import dagger.Component

@Component(modules = [ViewModelFactoryModule::class, ViewModelModule::class])
interface ViewModelComponent {
//    fun inject(mainActivity: MainActivity)
}