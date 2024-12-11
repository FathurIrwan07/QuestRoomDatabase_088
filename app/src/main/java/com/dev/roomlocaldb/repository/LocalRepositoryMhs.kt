package com.dev.roomlocaldb.repository

import com.dev.roomlocaldb.data.dao.MahasiswaDao
import com.dev.roomlocaldb.data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}