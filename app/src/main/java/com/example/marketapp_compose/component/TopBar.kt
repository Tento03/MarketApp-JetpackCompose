package com.example.marketapp_compose.component

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme

@Composable
fun TopBar(){
    Column(modifier = Modifier.padding(16.dp)) {
        Row(modifier = Modifier.width(IntrinsicSize.Max),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .widthIn(200.dp)
                    .padding(start = 8.dp, end = 8.dp),
                value = "",
                onValueChange = {},
                placeholder = { Text(text = "Search Here")},
                leadingIcon = { Icon(imageVector = Icons.Outlined.Search, contentDescription = null)}
            )
           Row(modifier = Modifier.offset(10.dp),
           horizontalArrangement = Arrangement.spacedBy(8.dp)) {
               Icon(imageVector = Icons.Outlined.Email,
                   contentDescription = null,
                   modifier = Modifier
                       .align(Alignment.CenterVertically)
                       .size(24.dp))
               Icon(imageVector = Icons.Outlined.ShoppingCart,
                   contentDescription = null,
                   modifier = Modifier
                       .align(Alignment.CenterVertically)
                       .size(24.dp))
               Icon(imageVector = Icons.Outlined.Notifications,
                   contentDescription = null,
                   modifier = Modifier
                       .align(Alignment.CenterVertically)
                       .size(24.dp))
               Icon(imageVector = Icons.Outlined.Menu,
                   contentDescription = null,
                   modifier = Modifier
                       .align(Alignment.CenterVertically)
                       .size(24.dp))
           }
        }
        Row(modifier = Modifier.padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Outlined.LocationOn,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
                    .offset(5.dp)
                )
            Text(text = "Dikirim Ke Alamat")
            Text(text = "Christento Siregar", fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Icon(imageVector = Icons.Default.ArrowDropDown,
                contentDescription = null,
                modifier = Modifier.size(18.dp)
                )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TopBarPreview(){
    MarketAppComposeTheme {
        TopBar()
    }
}