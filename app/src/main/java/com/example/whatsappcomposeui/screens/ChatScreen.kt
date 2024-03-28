package com.example.whatsappcomposeui.screens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappcomposeui.components.SingleChat
import com.example.whatsappcomposeui.data.chatDataList

@Composable
fun ChatScreen() {
    LazyColumn(Modifier.padding(5.dp)){
        items(chatDataList){
            chatDataList.forEach {
                SingleChat(chatData = it)
                Spacer(modifier = Modifier.height(2.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ChatScreenPreview() {
    ChatScreen()
}