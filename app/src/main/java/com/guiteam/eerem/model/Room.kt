package com.guiteam.eerem.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "room")
data class Room (
    @ColumnInfo(name="id") @PrimaryKey(autoGenerate = true) var id : Long = 0,
    @ColumnInfo(name="name") var name: String,
    @ColumnInfo(name="location") var location : String,
    @ColumnInfo(name="usual_purpose") var usualPurpose : String
)