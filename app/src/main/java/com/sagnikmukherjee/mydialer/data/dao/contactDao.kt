package com.sagnikmukherjee.mydialer.data.dao

import android.provider.ContactsContract.CommonDataKinds.Contactables
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.sagnikmukherjee.mydialer.data.tables.Contact
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao{
    @Upsert
    suspend fun upsertContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    @Query("SELECT * FROM contactTable ORDER BY name ASC")
    fun getContactsOrderedByName(): Flow<List<Contact>>
}