package com.guiteam.eerem.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (
    @ColumnInfo(name="id") @PrimaryKey(autoGenerate = true) var id : Long = 0,
    @ColumnInfo(name="username") var username : String,
    @ColumnInfo(name="name") var name : String,
    @ColumnInfo(name="email") var email : String,
    @ColumnInfo(name="password") var password : String,
    @ColumnInfo(name="nrp") var nrp : String,
    @ColumnInfo(name="major") var major : String,
    @ColumnInfo(name="phone_number") var phoneNumber : String
)