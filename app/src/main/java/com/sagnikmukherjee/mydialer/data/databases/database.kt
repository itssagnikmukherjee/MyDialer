package com.sagnikmukherjee.mydialer.data.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sagnikmukherjee.mydialer.data.dao.ContactDao
import com.sagnikmukherjee.mydialer.data.tables.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase: RoomDatabase(){
    abstract fun dao(): ContactDao
}