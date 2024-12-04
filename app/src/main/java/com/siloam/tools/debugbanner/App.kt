package com.siloam.tools.debugbanner

import android.app.Application
import com.siloam.tools.debug.banner.DebugBanner

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        DebugBanner.init(application = this)
    }
}