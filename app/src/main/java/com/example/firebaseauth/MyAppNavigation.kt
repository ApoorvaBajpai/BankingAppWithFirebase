package com.example.firebaseauth

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebaseauth.pages.Home
import com.example.firebaseauth.pages.LoginPage
import com.example.firebaseauth.pages.SignUpPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login"){
            LoginPage(modifier,navController,authViewModel)
        }
        composable("signup"){
            SignUpPage(modifier,navController,authViewModel)
        }
        composable("home"){
            Home(modifier,navController,authViewModel)
        }
        composable("bank"){
            HomeScreen(modifier,navController)
        }
    })
}