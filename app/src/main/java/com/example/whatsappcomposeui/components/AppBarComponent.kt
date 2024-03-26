package com.example.whatsappcomposeui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappcomposeui.R
import com.example.whatsappcomposeui.ui.theme.WhatsAppComposeUITheme

@Composable
fun AppBarComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(id = R.string.app_title),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = if(isSystemInDarkTheme()) Color.Gray else Color.White
                )
        )
        Spacer(modifier = Modifier.weight(1f))
        IconComposable(drawableId = R.drawable.ic_camera)
        Spacer(modifier = Modifier.width(20.dp))
        IconComposable(drawableId = R.drawable.ic_search)
        Spacer(modifier = Modifier.width(20.dp))
        IconComposable(drawableId = R.drawable.ic_menu)
    }
}

@Composable
fun IconComposable(drawableId: Int, desc: String = "") {
    Icon(painter = painterResource(id = drawableId), contentDescription = desc,
        tint = MaterialTheme.colorScheme.tertiary)
}

@Preview(showBackground = true)
@Composable
fun AppBarComponentPreview() {
    WhatsAppComposeUITheme {
        AppBarComponent()
    }
}