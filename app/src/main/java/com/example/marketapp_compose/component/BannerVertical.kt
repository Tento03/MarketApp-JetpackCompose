package com.example.marketapp_compose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marketapp_compose.R
import com.example.marketapp_compose.model.ListCardForYou
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme

@Composable
fun BannerVertical(listCardForYou: ListCardForYou){
    Card(shape = RoundedCornerShape(8.dp),
        modifier = Modifier.padding(8.dp)
        ) {
        Image(painter = painterResource(id = listCardForYou.imgCard), contentDescription = null )
        Text(text = stringResource(id = listCardForYou.txtDesc))
    }
}

@Composable
@Preview(showBackground = true)
fun BannerVerticalPreview(){
    MarketAppComposeTheme() {
        BannerVertical(listCardForYou = ListCardForYou(R.drawable.banner_vertikal1,R.string.txt_desc_first_banner))
    }
}