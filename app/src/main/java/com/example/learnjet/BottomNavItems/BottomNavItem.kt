package com.example.learnjet.BottomNavItems


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigation(
    val title: String,
    val icon: ImageVector,
    val route: String
)

val bottomNavItems = listOf(
    BottomNavigation("Home", Icons.Rounded.Home, "home"),
    BottomNavigation("Wallet", Icons.Rounded.Wallet, "wallet"),
    BottomNavigation("Notifications", Icons.Rounded.Notifications, "notifications"),
    BottomNavigation("Account", Icons.Rounded.AccountCircle, "account")
)
