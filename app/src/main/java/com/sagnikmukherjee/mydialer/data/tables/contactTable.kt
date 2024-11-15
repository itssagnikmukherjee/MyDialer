package com.sagnikmukherjee.mydialer.data.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contactTable")
data class Contact(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val number: String,
    val image: String,
    val email: String
)