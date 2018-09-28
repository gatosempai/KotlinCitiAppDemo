package com.example.oscar.kotlincitiappdemo

import android.app.Application

class AndroidApplication : Application() {

    //var applicationComponent: ApplicationComponent? = null
        //private set

    override fun onCreate() {
        super.onCreate()
        initializeInjector()
    }

    private fun initializeInjector() {
        //this.applicationComponent = DaggerApplicationComponent.builder()
        //        .applicationModule(ApplicationModule(this))
        //        .build()
    }

}