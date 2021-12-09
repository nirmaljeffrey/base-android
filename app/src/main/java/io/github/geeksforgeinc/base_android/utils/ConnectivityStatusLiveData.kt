package io.github.geeksforgeinc.base_android.utils

import android.content.Context
import androidx.lifecycle.LiveData

class ConnectivityStatusLiveData(
    context: Context
) : LiveData<Boolean>() {
    private val connectivityStatusMonitor = ConnectivityStatusMonitor(
        context,
        onNetworkAvailable = {
            postValue(true)
        },
        onNetworkUnAvailable = {
            postValue(false)
        }
    )

    private val networkCallback = connectivityStatusMonitor.getNetWorkCallBack()

    override fun onActive() {
        connectivityStatusMonitor.enable(networkCallback)
    }

    override fun onInactive() {
        connectivityStatusMonitor.disable(networkCallback)
    }
}