package com.example.marketapp_compose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marketapp_compose.R
import com.example.marketapp_compose.model.ListBanner
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme

@Composable
fun CardCategory(listBanner: ListBanner){
    Card(modifier = Modifier
        .width(175.dp)
        .padding(8.dp)
        .heightIn(48.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Image(painter = painterResource(id = listBanner.imgBanner) , contentDescription = null)
    }
}

@Composable
@Preview(showBackground = true)
fun CardCategoryPreview(){
    MarketAppComposeTheme {
        CardCategory(listBanner = ListBanner(R.drawable.banner1))
    }
}