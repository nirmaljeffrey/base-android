package io.github.geeksforgeinc.base_android.util

import android.util.Log
import timber.log.Timber

class ReleaseTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        // TODO Add firebase Crashlytics if required
        if (isLoggable(tag,priority)) {
            if(priority == Log.ERROR && t != null) {
//                FirebaseCrashlytics.getInstance().recordException(t);
            } else {
//                FirebaseCrashlytics.getInstance().log(message);
            }
        }

    }

    override fun isLoggable(tag: String?, priority: Int): Boolean {
        if(priority == Log.VERBOSE || priority == Log.DEBUG || priority == Log.INFO){
            return false;
        }
        //Only log WARN, ERROR, WTF
        return true;

    }
}