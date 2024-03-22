package com.company.velogjetpackcomoposenestednavigationgraph.NavRoots

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.ForgotPassword
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.Register
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.Screen
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.login

fun NavGraphBuilder.firstNavGraph(navController: NavController) {
    navigation(startDestination = Screen.login.route , route = navRoots.first.route) {
        // navigation의 parameter의 startDestination : 시작 화면 , route : 중첩된 navigation 식별자
        composable(route = Screen.login.route) {
            login(navController)
        }
        composable(route = Screen.register.route) {
            Register(navController)
        }
        composable(route = Screen.forgotPassword.route) {
            ForgotPassword(navController)
        }
    }
}

