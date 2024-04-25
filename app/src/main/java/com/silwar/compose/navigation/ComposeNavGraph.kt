package com.silwar.compose.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.silwar.compose.main.MainScreen
import com.silwar.compose.bottomsheet.BottomSheetScreen
import com.silwar.compose.list.LazyColumn1Screen

@Composable
fun ComposeNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ComposeRoutes.MainScreen.name,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(ComposeRoutes.MainScreen.name) {
            MainScreen(navController = navController)
        }
        composable(ComposeRoutes.BottomSheetScreen.name) {
            BottomSheetScreen()
        }
        composable(ComposeRoutes.List1.name) {
            LazyColumn1Screen()
        }
    }
}