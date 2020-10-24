package com.guiteam.eerem.model

import androidx.room.*

@Dao
interface UserDAO {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id = id")
    fun getByID(id: Long) : User

    @Query("SELECT * FROM user WHERE username = username AND password = password")
    fun authenticateUser(username: String, password: String) : User

    @Insert
    fun insert(user: User)

    @Update
    fun update(user: User)

    @Delete
    fun delete(user: User)
}