package com.dev.roomlocaldb.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dev.roomlocaldb.data.dao.MahasiswaDao
import com.dev.roomlocaldb.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {


    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile // memastikan bahwa nilai
        private var Instance: KrsDatabase? =null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, //class database
                    "KrsDatabase" //nama database
                )
                    .build().also { Instance = it }
            })
            

        }
    }
}
