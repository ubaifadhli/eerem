package com.guiteam.eerem.viewmodel

import androidx.room.Database
import androidx.room.RoomDatabase
import com.guiteam.eerem.model.*

@Database(entities = arrayOf(User::class, Room::class, Reservation::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDAO() : UserDAO
    abstract fun roomDAO() : RoomDAO
    abstract fun reservationDAO() : ReservationDAO
}