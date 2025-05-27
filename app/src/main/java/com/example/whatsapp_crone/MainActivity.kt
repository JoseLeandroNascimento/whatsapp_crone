package com.example.whatsapp_crone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.whatsapp_crone.screens.Host
import com.example.whatsapp_crone.ui.theme.Whatsapp_croneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Whatsapp_croneTheme {
                val navController = rememberNavController()
                Host(navController = navController)
            }
        }
    }
}

