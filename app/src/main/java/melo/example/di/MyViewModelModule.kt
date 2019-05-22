package melo.example.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import melo.android.mvvm.dagger.ViewModelKey
import melo.example.MainViewModel

@Module
abstract class MyViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMyViewModel(mainViewModel: MainViewModel): ViewModel
}