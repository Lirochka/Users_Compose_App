package com.example.userscompose.feature_users.presentation.home

import com.example.userscompose.feature_users.domain.model.User

data class HomeState(
    val users: List<User> = emptyList()
)
