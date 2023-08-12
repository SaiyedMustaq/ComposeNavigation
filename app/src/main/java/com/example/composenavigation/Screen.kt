package com.example.composenavigation

sealed class Screen(var routes:String){
    object LoginScreen:Screen("login_screen")
    object SignUpScreen:Screen("signup_screen")
    object ForgotScreen:Screen("forgot_screen")

    fun withArgs(vararg args:String): String {
        return buildString {
            append(routes)
            args.forEach { arg->append("/$arg") }
        }
    }
}