package io.github.geeksforgeinc.base_android.utils

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import timber.log.Timber

class Poller<ResponseType> (
   private val dispatcher : CoroutineDispatcher,
   private val delayTimeInMillis: Long = 5000,
   private val fetch : suspend () -> ResponseType,
   private val saveFetchResult: suspend (ResponseType) -> Unit,
   private val onError: (throwable: Throwable) -> Unit = { Timber.e(it) }
) {
   private var isPaused = true
   private val mainScope = CoroutineScope(SupervisorJob() + dispatcher)
   init {
      mainScope.launch {
         poll().collect {
            saveFetchResult(it)
         }
      }
   }
   fun resumePolling() {
       isPaused = false
   }

   fun pausePolling() {
      isPaused = true
   }
   fun stopPolling() {
      mainScope.cancel()
   }

   private fun poll(): Flow<ResponseType> {
      return flow {
            while (mainScope.isActive) {
               if (!isPaused) {
                  try {
                     emit(fetch())
                  } catch (e: Throwable) {
                     onError(e)
                  }
                  delay(delayTimeInMillis)
               }
            }
         }.flowOn(dispatcher)
   }

}