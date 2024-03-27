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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappcomposeui.R

@Composable
fun ChatComponent() {
    Text(text="hello from chat screen")
}


@Composable
fun SingleChat() {
    Row(modifier = Modifier.fillMaxWidth().height(80.dp).padding(1.dp)) {
        Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "profile picture"
        ,modifier = Modifier.requiredSize(80.dp).clip(CircleShape))
        Column() {
            Row(Modifier.padding(10.dp)) {
// name and date
                Text(text = "Jon Targeryen")
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "27/02/2023")
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(Modifier.padding(10.dp)) {
// last chat and unreadMsgs count
                Text(text = "see you tomorrow")
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "3", style = TextStyle(fontSize = 12.sp, textAlign = TextAlign.Center, color = MaterialTheme.colorScheme.tertiary),
                    modifier = Modifier
                        .padding(4.dp)
                        .clip(CircleShape)
                        .requiredSize(20.dp)
                        .background(Color.Green)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SingleChatPreview() {
    SingleChat()
}