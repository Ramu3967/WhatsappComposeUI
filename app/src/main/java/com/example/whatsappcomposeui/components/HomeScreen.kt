package com.example.whatsappcomposeui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen() {
    Column {
        AppBarComponent()
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}