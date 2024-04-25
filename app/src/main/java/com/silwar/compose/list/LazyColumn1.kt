package com.silwar.compose.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.silwar.compose.extensions.limitDecimal
import kotlin.random.Random


@Composable
fun LazyColumn1Screen() {
    val data = list1
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF2196F3))
    ) {
        item(contentType = "header") {
            Text(
                text = "Merchant Transactions",
                fontSize = 26.sp,
                color = Color(0xFFFFFFFF),
                fontWeight = FontWeight(700)
            )
        }
        items(data.keys.toList()) { title ->
            val item = data[title]
            CardSectionElement(
                title = title
            ) { modifier ->
                item?.forEachIndexed { index, text ->
                    Column {
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .heightIn(min = 56.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = text,
                                fontSize = 22.sp,
                                fontWeight = FontWeight(500),
                                modifier = Modifier.weight(1f)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Rs.${Random.nextDouble(500.00).limitDecimal()}",
                                fontSize = 28.sp,
                                textAlign = TextAlign.End,
                                fontWeight = FontWeight(300),
                                modifier = Modifier.weight(1f)
                            )
                        }
                        Divider(color = Color(0xFF146BB1),
                            modifier = Modifier.padding(horizontal = 16.dp))
                    }
                }
            }
        }
        item(contentType = "footer") {
            Text(
                text = "This is ongoing experiment for understanding different aspects of Jetpack Compose development. Feel free to contribute.",
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = Color(0xFFFFFFFF),
                fontWeight = FontWeight(400)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LazyColumn1ScreenPreview() {
    LazyColumn1Screen()
}