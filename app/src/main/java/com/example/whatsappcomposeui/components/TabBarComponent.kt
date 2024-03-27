package com.example.whatsappcomposeui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappcomposeui.data.TabData
import com.example.whatsappcomposeui.data.tabList
import com.example.whatsappcomposeui.ui.theme.White

@Composable
fun TabBarComponent() {
    var selectedIndex by remember { mutableStateOf(0) }
    TabRow(
        selectedTabIndex = selectedIndex,
        indicator =  {tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPositions[selectedIndex]),
                color = MaterialTheme.colorScheme.tertiary,
                height = 3.dp
            )
        }
    ) {
        tabList.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex, onClick = {selectedIndex = index},
                modifier = Modifier.background(MaterialTheme.colorScheme.primary).padding(4.dp),
            ) {
                tabData.unReadCount?.let {
                    TextWithUnreadCount(tabData)
                } ?: run {
                    Text(
                        text = tabData.tabName, style = TextStyle(
                            fontSize = 16.sp,
                            background = MaterialTheme.colorScheme.primary,
                            color = MaterialTheme.colorScheme.tertiary,
                            textAlign = TextAlign.Center
                        )
                    )
                }

            }
        }
    }
}

@Composable
private fun TextWithUnreadCount(tabData: TabData) {
    Row {
        Text(
            text = tabData.tabName, style = TextStyle(
                fontSize = 16.sp,
                background = MaterialTheme.colorScheme.primary,
                color = MaterialTheme.colorScheme.tertiary,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = tabData.unReadCount.toString(),
            style = TextStyle(fontSize = 12.sp, color = MaterialTheme.colorScheme.primary, textAlign = TextAlign.Center),
            modifier = Modifier
                .padding(4.dp)
                .requiredSize(16.dp)
                .clip(shape = CircleShape)
                .background(White)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TabBarComponentPreview() {
    TabBarComponent()
}