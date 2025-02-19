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
import androidx.compose.ui.unit.sp
import com.example.marketapp_compose.model.ListCategory
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme
import com.example.marketapp_compose.R

@Composable
fun TopCategory(listCategory: ListCategory){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
        Image(painter = painterResource(id = listCategory.imgTopCategory),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
            )
        Text(text = stringResource(id = listCategory.txtTopCategory), fontSize = 12.sp)
    }
}

@Composable
@Preview(showBackground = true)
fun TopCategoryPreview(){
    MarketAppComposeTheme() {
        TopCategory(listCategory = ListCategory(R.drawable.cicil,R.string.txt_credit))
    }
}