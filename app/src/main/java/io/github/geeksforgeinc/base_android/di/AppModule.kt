package io.github.geeksforgeinc.base_android.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.Multibinds
import io.github.geeksforgeinc.base_android.data.persistance.AppDatabase
import io.github.geeksforgeinc.base_android.data.persistance.dao.EntityDao
import io.github.geeksforgeinc.base_android.data.remote.api.Api
import io.github.geeksforgeinc.base_android.utils.Constants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    @NetworkInterceptor
    @Multibinds
    abstract fun providesNetworkInterceptor(): Set<@JvmSuppressWildcards Interceptor>

    companion object {
        @Provides
        @Singleton
        fun providesOkHttpClient(@NetworkInterceptor networkInterceptors: Set<@JvmSuppressWildcards Interceptor>): OkHttpClient {
            val builder: OkHttpClient.Builder = OkHttpClient.Builder();
            if (networkInterceptors.isNotEmpty()) {
                builder.networkInterceptors().addAll(networkInterceptors)
            }
            return builder
                .build()
        }

        // TODO replace Api and BASE_URL
        @Provides
        @Singleton
        fun providesApi(okHttpClient: OkHttpClient): Api {
            return Retrofit.Builder()
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build()
                .create(Api::class.java)
        }


        @Provides
        @Singleton
        fun providesAppDatabase(@ApplicationContext context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java, AppDatabase.DATABASE_NAME
            ).build()
        }

        // TODO replace EntityDao
        @Provides
        @Singleton
        fun providesEntityDao(appDatabase: AppDatabase): EntityDao = appDatabase.EntityDao()

    }
}