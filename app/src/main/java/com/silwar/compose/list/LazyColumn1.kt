package com.silwar.compose.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LazyColumn1Screen() {
    val data = list1
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2196F3))
    ) {
        item(contentType = "header") {
            Text(
                text = "Settings",
                fontSize = 32.sp,
                color = Color(0xFFFFFFFF),
                fontWeight = FontWeight(700),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            )
        }
        items(data.keys.toList()) { title ->
            val item = data[title]
            CardSectionElement(
                title = title,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) { modifier ->
                item?.forEachIndexed { index, text ->
                    Column(modifier = modifier) {
                        Text(
                            text = "# ${index + 1}",
                            fontSize = 20.sp,
                            fontWeight = FontWeight(500)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = text,
                            fontSize = 18.sp,
                            fontWeight = FontWeight(300)
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Divider(color = Color(0xFF146BB1))
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyColumn1ScreenPreview() {
    LazyColumn1Screen()
}