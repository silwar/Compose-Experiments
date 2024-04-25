package com.silwar.compose.list

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardSectionElement(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.(Modifier) -> Unit
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = modifier
            .padding(horizontal = 4.dp, vertical = 8.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = title,
            fontSize = 26.sp,
            color = Color(0xFF125183),
            fontWeight = FontWeight(600),
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 16.dp
                )
        )
        Spacer(modifier = Modifier.height(8.dp))
        content(
            Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun CardSectionElementPreview() {
    CardSectionElement("title") {
        Text(text = "Element", modifier = it)
    }
}