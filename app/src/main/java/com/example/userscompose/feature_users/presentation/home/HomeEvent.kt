package com.example.userscompose.feature_users.presentation.home

import com.example.userscompose.feature_users.domain.model.User

sealed class HomeEvent{
    data class DeleteUser(val user: User): HomeEvent()
}
