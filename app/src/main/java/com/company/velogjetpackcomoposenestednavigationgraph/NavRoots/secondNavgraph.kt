package com.company.velogjetpackcomoposenestednavigationgraph.NavRoots

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.A
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.B
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.Home
import com.company.velogjetpackcomoposenestednavigationgraph.Screens.Screen

fun NavGraphBuilder.secondNavgraph(navController: NavController) {
    navigation(startDestination = Screen.login.route , route = navRoots.second.route) {
        // navigation의 parameter의 startDestination : 시작 화면 , route : 중첩된 navigation 식별자
        composable(route = Screen.Home.route) {
            Home(navController)
        }
        composable(route = Screen.A.route) {
            A(navController)
        }
        composable(route = Screen.B.route) {
            B(navController)
        }
    }
}