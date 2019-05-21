package melo.example.di

import dagger.Component
import melo.android.mvvm.dagger.ViewModelComponent
import melo.android.mvvm.dagger.ViewModelFactoryModule
import melo.example.MainActivity
import javax.inject.Singleton

//https://medium.com/@marco_cattaneo/android-viewmodel-and-factoryprovider-good-way-to-manage-it-with-dagger-2-d9e20a07084c

@Singleton
@Component(modules = [ViewModelFactoryModule::class, MyViewModelModule::class])
interface MyViewModelComponent: ViewModelComponent {

    fun inject(activity: MainActivity)

}
