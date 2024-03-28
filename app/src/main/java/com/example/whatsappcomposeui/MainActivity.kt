package com.example.whatsappcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappcomposeui.components.HomeScreen
import com.example.whatsappcomposeui.components.TabBarComponent
import com.example.whatsappcomposeui.data.tabList
import com.example.whatsappcomposeui.screens.CallScreen
import com.example.whatsappcomposeui.screens.ChatScreen
import com.example.whatsappcomposeui.screens.StatusScreen
import com.example.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppComposeUITheme {
                Column{
                    val myPagerState = rememberPagerState(initialPage = 0, pageCount = { tabList.size })

                    HomeScreen()
                    TabBarComponent(myPagerState)
                    HorizontalPager(state = myPagerState, modifier = Modifier.fillMaxSize(), pageSpacing = 10.dp ){page ->
                        when(page){
                            0 -> ChatScreen()
                            1 -> StatusScreen()
                            2 -> CallScreen()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    WhatsAppComposeUITheme {
        Column{
            HomeScreen()
//            TabBarComponent()
        }
    }
}