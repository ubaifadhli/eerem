package com.guiteam.eerem.model

import androidx.room.*

@Dao
interface ReservationDAO {
    @Query("SELECT * FROM reservation")
    fun getAll(): List<Reservation>

    @Insert
    fun insert(reservation: Reservation)

    @Update
    fun update(reservation: Reservation)

    @Delete
    fun delete(reservation: Reservation)
}