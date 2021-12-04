package io.github.geeksforgeinc.base_android.di.intializers

import android.content.Context
import androidx.startup.Initializer
import io.github.geeksforgeinc.base_android.di.InitializerEntryPoint
import io.github.geeksforgeinc.base_android.di.TimberService
import javax.inject.Inject

class TimberInitializer : Initializer<TimberService> {
    @Inject
    lateinit var timberService: TimberService

    override fun create(context: Context): TimberService {
        InitializerEntryPoint.resolve(context).inject(this)
        timberService.initialize()
        return timberService
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(DependencyGraphInitializer::class.java)
    }
}