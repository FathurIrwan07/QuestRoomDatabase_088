package com.dev.roomlocaldb.repository

import com.dev.roomlocaldb.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}