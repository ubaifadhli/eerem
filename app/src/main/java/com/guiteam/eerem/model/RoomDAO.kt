package com.guiteam.eerem.model

import androidx.room.*

@Dao
interface RoomDAO {
    @Query("SELECT * FROM room")
    fun getAll(): List<Room>

    @Insert
    fun insert(room: Room)

    @Update
    fun update(room: Room)

    @Delete
    fun delete(room: Room)
}