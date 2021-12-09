package io.github.geeksforgeinc.base_android.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest

class ConnectivityStatusMonitor(
    private val context: Context,
    private val onNetworkAvailable : () -> Unit,
    private val onNetworkUnAvailable : () -> Unit
) {
    private val connectivityManager by lazy {
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    private fun getNetworkRequest(): NetworkRequest {
        return NetworkRequest.Builder()
            .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
            .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
            .build()
    }

    fun getNetWorkCallBack(): ConnectivityManager.NetworkCallback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                super.onAvailable(network)
                onNetworkAvailable()
            }

            override fun onLost(network: Network) {
                super.onLost(network)
                onNetworkUnAvailable()
            }
        }

    fun enable(networkCallback: ConnectivityManager.NetworkCallback) {
            connectivityManager.registerNetworkCallback(getNetworkRequest(), networkCallback)
    }

    fun disable(networkCallback: ConnectivityManager.NetworkCallback) {
        connectivityManager.unregisterNetworkCallback(networkCallback)
    }
}