package com.example.whatsappcomposeui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappcomposeui.R
import com.example.whatsappcomposeui.data.ChatData
import com.example.whatsappcomposeui.data.DeliveryStatus
import com.example.whatsappcomposeui.data.MessageDetails
import com.example.whatsappcomposeui.data.MessageType
import com.example.whatsappcomposeui.data.UserDetails

@Composable
fun ChatComponent() {
    Text(text="hello from chat screen")
}


@Composable
fun SingleChat(chatData: ChatData) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(1.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = chatData.userDetails.userDp),
            contentDescription = "profile picture",
            modifier = Modifier
                .requiredSize(70.dp)
                .clip(CircleShape)
        )
        Column() {
            Row(Modifier.padding(5.dp)) {
            // name and date
                Text(text = chatData.userDetails.userName, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = chatData.messageDetails.timeStamp, fontSize = 12.sp)
            }
            Spacer(modifier = Modifier.height(2.dp))
            Row(Modifier.padding(5.dp)) {
            // last chat and unreadMsgs count
                Text(text = chatData.messageDetails.message)
                Spacer(modifier = Modifier.weight(1f))
                HandleUnreadCount(chatData)
            }
        }
    }
}

@Composable
private fun HandleUnreadCount(chatData: ChatData) {
    if(chatData.messageDetails.unreadCount==0) return
    Text(
        text = chatData.messageDetails.unreadCount.toString(),
        style = TextStyle(
            fontSize = 12.sp,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.tertiary
        ),
        modifier = Modifier
            .padding(4.dp)
            .clip(CircleShape)
            .requiredSize(20.dp)
            .background(Color.Green)
    )
}

@Preview(showBackground = true)
@Composable
fun SingleChatPreview() {
    SingleChat(
        ChatData(
            chatId = 2,
            messageDetails = MessageDetails(
                message = "I'm good, thanks!",
                timeStamp = "2024-03-27 10:05 AM",
                messageType = MessageType.MESSAGE,
                deliveryStatus = DeliveryStatus.SEEN,
                unreadCount = 0
            ),
            userDetails = UserDetails(
                userName = "Bob",
                userDp = R.drawable.img_1
            )
    )
    )
}