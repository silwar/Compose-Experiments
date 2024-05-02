package com.silwar.compose.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.silwar.compose.list.localdata.list1
import com.silwar.compose.list.model.BigImageTextListItemModel
import com.silwar.compose.list.model.HorizontalRemoteImageListItemModel
import com.silwar.compose.list.model.ImageTitleSubtitleListItemModel


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
            CardSectionElement(
                title = title
            ) { modifier ->
                val list = data[title]
                list?.forEachIndexed { index, item ->
                    Column {
                        when (item) {
                            is String -> AmountListItem(text = item)
                            is BigImageTextListItemModel -> BigImageTextListItem(item = item)
                            is HorizontalRemoteImageListItemModel -> HorizontalRemoteImageList(
                                model = item
                            )

                            is ImageTitleSubtitleListItemModel -> ImageTextListITem(item = item)
                        }
                    }
                    if (index < list.size - 1) {
                        Divider(
                            color = Color(0xFF146BB1),
                            modifier = Modifier.padding(
                                horizontal = 16.dp,
                            )
                        )
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