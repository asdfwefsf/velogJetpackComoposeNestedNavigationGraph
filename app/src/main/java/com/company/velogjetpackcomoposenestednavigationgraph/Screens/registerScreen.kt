package com.company.velogjetpackcomoposenestednavigationgraph.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Register(navcontroller : NavController) {
    Column{
        Text(text = "Register")
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {
            navcontroller.navigate(Screen.login.route)
        }) {
            Text("Yes")
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {
            navcontroller.navigate(Screen.login.route)
        }) {
            Text("No")
        }
    }

}