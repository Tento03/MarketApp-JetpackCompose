package com.example.marketapp_compose.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.marketapp_compose.model.BottomBarItem
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme
import com.example.marketapp_compose.R

@Composable
fun BottomNavigationBar(){
    BottomNavigation() {
        val bottomNavigation= listOf(
            BottomBarItem(
            title = stringResource(id = R.string.txt_home),
            icon = Icons.Default.Home),
            BottomBarItem(
                title = stringResource(id = R.string.txt_official_store),
                icon = Icons.Default.ShoppingCart
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_notification),
                icon = Icons.Default.Notifications
            ),
            BottomBarItem(
                title = stringResource(id = R.string.txt_profile),
                icon = Icons.Default.Person
            )
        )
        bottomNavigation.map {
            BottomNavigationItem(
                selected = it.title==bottomNavigation[0].title,
                onClick = {},
                icon = { Icon(imageVector = it.icon, contentDescription = it.title)},
                label = { Text(text = it.title)}
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun BottomNavigationPreview(){
    MarketAppComposeTheme {
        BottomNavigationBar()
    }
}