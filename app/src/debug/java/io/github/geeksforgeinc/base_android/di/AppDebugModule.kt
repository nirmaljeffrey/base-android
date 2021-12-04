package io.github.geeksforgeinc.base_android.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import javax.inject.Singleton
import com.chuckerteam.chucker.api.ChuckerInterceptor
import dagger.hilt.android.qualifiers.ApplicationContext


@Module
@InstallIn(SingletonComponent::class)
object AppDebugModule {

    @Provides
    @Singleton
    fun providesDebugTimberTree(): Timber.Tree {
        return object : Timber.DebugTree() {
            override fun createStackElementTag(element: StackTraceElement): String {
                return super.createStackElementTag(element) + ":" + element.lineNumber
            }
        }
    }

    @Provides
    @Singleton
    @IntoSet
    @NetworkInterceptor
    fun providesHttpLoggingInterceptor(): Interceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    @Provides
    @Singleton
    @IntoSet
    @NetworkInterceptor
    fun providesChuckerInterceptor(@ApplicationContext context : Context): Interceptor {
        return ChuckerInterceptor.Builder(context).build()
    }
}