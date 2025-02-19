package com.example.marketapp_compose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marketapp_compose.R
import com.example.marketapp_compose.model.ListTopMenu
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme

@Composable
fun TopMenu(listTopMenu: ListTopMenu){
    Row(
        modifier = Modifier
            .padding(8.dp)
            .height(IntrinsicSize.Max),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(painter = painterResource(id = listTopMenu.imgTopBar),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Column() {
            Text(text = stringResource(id = listTopMenu.txtTopBar), fontSize = 14.sp)
            Text(text = stringResource(id = listTopMenu.descTopBar), fontWeight = FontWeight.Bold, fontSize = 14.sp)
        }
        Divider(modifier = Modifier
            .size(1.dp)
            .height(40.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun TopMenuPreview(){
    MarketAppComposeTheme {
        TopMenu(listTopMenu = ListTopMenu(R.drawable.gopay, R.string.txt_gopay, R.string.txt_dummy_gopay))
    }
}