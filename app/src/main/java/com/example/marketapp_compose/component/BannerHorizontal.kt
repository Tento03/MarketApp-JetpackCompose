package com.example.marketapp_compose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marketapp_compose.R
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme

@Composable
fun BannerHorizontal(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Card(shape = RoundedCornerShape(8.dp)) {
                Image(painter = painterResource(id = R.drawable.banner_horizontal_1), contentDescription = null)
            }
            Card(shape = RoundedCornerShape(8.dp)) {
                Image(painter = painterResource(id = R.drawable.banner_horizontal_2), contentDescription = null)
            }
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Card(shape = RoundedCornerShape(10.dp) ) {
                Image(painter = painterResource(id = R.drawable.banner_horizontal_3), contentDescription = null)
            }
            Card(shape = RoundedCornerShape(8.dp)) {
                Image(painter = painterResource(id = R.drawable.banner_horizontal_4), contentDescription = null)
            }

        }
    }
}

@Composable
@Preview(showBackground = true)
fun ImageCategoryPreview(){
   MarketAppComposeTheme {
       BannerHorizontal()
   }
}