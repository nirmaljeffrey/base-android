package io.github.geeksforgeinc.base_android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.geeksforgeinc.base_android.util.ReleaseTree
import timber.log.Timber
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppReleaseModule {

    @Provides
    @Singleton
    fun providesReleaseTimberTree(): Timber.Tree = ReleaseTree()
}