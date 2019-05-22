package melo.android.mvvm.dagger

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ViewModelFactoryModule {

    @Binds
    @Singleton
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}