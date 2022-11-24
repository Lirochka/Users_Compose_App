package com.example.userscompose.feature_users.data.source.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.userscompose.feature_users.domain.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    //// Получение всех User из бд
    @Query("SELECT * FROM User")
    fun getUsers(): Flow<List<User>>

    //// Получение всех User из бд с условием
    @Query("SELECT * FROM User WHERE id = :id")
    suspend fun getUserById(id: Int): User?

    //Добавление User в бд. В режиме REPLACE старая запись будет заменена новой
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)
}