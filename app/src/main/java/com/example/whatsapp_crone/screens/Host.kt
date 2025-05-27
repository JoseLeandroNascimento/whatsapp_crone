package com.example.whatsapp_crone.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.whatsapp_crone.screens.chatScreen.ChatScreen
import com.example.whatsapp_crone.screens.homeScreen.HomeScreen

@Composable
fun Host(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {

    NavHost(navController = navController, startDestination = Screen.HOME.router) {
        composable(Screen.HOME.router) {
            HomeScreen(
                onChangeNavigator = {
                    navController.navigate(it.router)
                }
            )
        }
        composable(Screen.CHAT.router) {
            ChatScreen(onBack = {
                navController.popBackStack()
            })
        }
    }
}