package com.guiteam.eerem.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reservation")
data class Reservation (
    @ColumnInfo(name="id") @PrimaryKey(autoGenerate = true) var id : Long = 0,
    @ColumnInfo(name="room_id") var roomID: Long,
    @ColumnInfo(name="user_id") var userID: Long,
    @ColumnInfo(name="organizer") var organizer : String,
    @ColumnInfo(name="purpose") var purpose: String,
    @ColumnInfo(name="date") var date : Long
)