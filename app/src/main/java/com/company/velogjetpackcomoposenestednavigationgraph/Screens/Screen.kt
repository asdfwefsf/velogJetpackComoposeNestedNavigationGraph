package com.company.velogjetpackcomoposenestednavigationgraph.Screens

sealed class Screen (val route : String) {
    object login : Screen("login")
    object register : Screen("register")
    object forgotPassword : Screen("forgotPassword")
    object Home : Screen("Home")
    object A : Screen("A")
    object B : Screen("B")
}
