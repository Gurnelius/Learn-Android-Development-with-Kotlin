package com.example.two.trees.ui.compose

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.two.trees.R

sealed class Screen(
    val route: String,
    @StringRes val labelResourceId: Int,
    val icon: ImageVector
) {
    data object Home: Screen("Home", R.string.home_label, Icons.Filled.Home)
    data object Tour: Screen("Tour", R.string.tours_label, Icons.Filled.Place)
    data object Shop: Screen("Shop", R.string.shop_label, Icons.Filled.ShoppingCart)
}

val screens = listOf(Screen.Home, Screen.Tour, Screen.Shop)