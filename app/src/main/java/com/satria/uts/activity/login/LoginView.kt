package com.satria.uts.activity.login

import com.satria.uts.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}