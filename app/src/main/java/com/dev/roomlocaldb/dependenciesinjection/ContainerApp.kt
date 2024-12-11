package com.dev.roomlocaldb.dependenciesinjection

import android.content.Context
import com.dev.roomlocaldb.data.database.KrsDatabase
import com.dev.roomlocaldb.repository.LocalRepositoryMhs
import com.dev.roomlocaldb.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs:RepositoryMhs
}

class ContainerApp (private val contex: Context) : InterfaceContainerApp{
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(contex).mahasiswaDao())
    }
}