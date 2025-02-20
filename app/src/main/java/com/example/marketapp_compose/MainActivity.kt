package com.example.marketapp_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marketapp_compose.component.*
import com.example.marketapp_compose.model.dummyListBanner
import com.example.marketapp_compose.model.dummyListTopCategory
import com.example.marketapp_compose.model.dummyListTopMenus
import com.example.marketapp_compose.ui.theme.MarketAppComposeTheme
import com.gunder.market.model.dummyListBottomCategory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarketAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MarketAppComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun MarketApp(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        MainTopBar()
        MainTopMenu()
        MainTopCategory()
        MainBottomCategory()
        MainCardCategory()
        MainImageCategory()
    }
}

@Composable
@Preview(showBackground = true)
fun MarketAppPreview(){
    MarketAppComposeTheme {
        MarketApp()
    }
}

@Composable
fun MainTopBar(){
    TopBar()
}

@Composable
@Preview(showBackground = true)
fun MainTopBarPreview(){
    MarketAppComposeTheme {
        MainTopBar()
    }
}

@Composable
fun MainTopMenu(){
    LazyRow(modifier = Modifier.offset(20.dp)){
        items(dummyListTopMenus){
            TopMenu(listTopMenu = it)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainTopMenuPreview(){
    MarketAppComposeTheme {
        MainTopMenu()
    }
}

@Composable
fun MainTopCategory(){
    LazyRow(modifier = Modifier.offset(10.dp)){
        items(dummyListTopCategory){
            TopCategory(listCategory = it)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainTopCategoryPreview(){
    MarketAppComposeTheme {
        MainTopCategory()
    }
}

@Composable
fun MainBottomCategory(){
    LazyRow(modifier = Modifier.offset(10.dp)){
        items(dummyListBottomCategory){
            BottomCategory(listBottomCategory = it)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainBottomCategoryPreview(){
    MarketAppComposeTheme {
        MainBottomCategory()
    }
}

@Composable
fun MainCardCategory(){
    LazyRow(modifier = Modifier.offset(10.dp)){
        items(dummyListBanner){
            CardCategory(listBanner = it)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MainCardCategoryPreview(){
    MarketAppComposeTheme {
        MainCardCategory()
    }
}

@Composable
fun MainImageCategory(){
    ImageCategory()
}

@Composable
@Preview(showBackground = true)
fun MainImageCategoryPreview(){
    ImageCategory()
}