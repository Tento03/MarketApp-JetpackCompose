package com.example.marketapp_compose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marketapp_compose.R
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme
import com.gunder.market.model.ListBottomCategory

@Composable
fun BottomCategory(listBottomCategory: ListBottomCategory){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(8.dp)
        ) {
        Image(painter = painterResource(id = listBottomCategory.imgBottomCategory),
            contentDescription = null ,
            modifier = Modifier.size(40.dp)
            )
        Text(text = stringResource(id = listBottomCategory.txtBottomCategory))
    }
}


@Composable
@Preview(showBackground = true)
fun BottomCategoryPreview(){
    MarketAppComposeTheme {
        BottomCategory(listBottomCategory = ListBottomCategory(R.drawable.play,R.string.txt_category_sport))
    }
}