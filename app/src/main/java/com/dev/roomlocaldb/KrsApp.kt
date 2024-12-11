package com.dev.roomlocaldb

import android.app.Application
import com.dev.roomlocaldb.dependenciesinjection.ContainerApp
import com.dev.roomlocaldb.dependenciesinjection.InterfaceContainerApp

class KrsApp : Application() {

    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()

        //membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //instance adlah object yg di buat dari class
    }
}