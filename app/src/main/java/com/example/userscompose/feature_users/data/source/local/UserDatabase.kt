package com.example.userscompose.feature_users.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.userscompose.feature_users.data.source.local.dao.UserDao
import com.example.userscompose.feature_users.domain.model.User

@Database(
    entities = [User::class],
    version = 1,
    exportSchema = false
)
abstract class UserDatabase: RoomDatabase() {
        abstract val userDao: UserDao
}