package com.example.projectwithmvvm.ViewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.projectwithmvvm.Model.User

// View Model
class UserVM : ViewModel() {
    private val _users = mutableStateListOf<User>()

    public val usersList: List<User>
        get() = _users

    fun addNewUser(user: User) {
        _users.add(user)
    }


}