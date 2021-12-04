package io.github.geeksforgeinc.base_android.di.intializers

import android.content.Context
import androidx.startup.Initializer
import io.github.geeksforgeinc.base_android.di.InitializerEntryPoint

class DependencyGraphInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        InitializerEntryPoint.resolve(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}