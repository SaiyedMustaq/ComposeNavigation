package com.example.composenavigation

    sealed class NavigationScreen(var routes:String){
    object LoginNavigationScreen:NavigationScreen("login_screen")
    object SignUpScreen:NavigationScreen("signup_screen")
    object ForgotNavigationScreen:NavigationScreen("forgot_screen")

        fun navigateWithData(vararg args:String): String {
        return buildString {
            append(routes)
            args.forEach { arg->append("/$arg") }
        }
    }
}