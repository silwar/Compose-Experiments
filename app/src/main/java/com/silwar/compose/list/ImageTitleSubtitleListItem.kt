package com.silwar.compose.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.silwar.compose.list.model.ImageTitleSubtitleListItemModel

@Composable
fun ImageTextListITem(
    item: ImageTitleSubtitleListItemModel,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .height(100.dp)
            .padding(16.dp)
    ) {
        AsyncImage(
            model = item.imageUrl,
            contentDescription = null,
            modifier = Modifier
                .aspectRatio(1f)
                .clip(RoundedCornerShape(16.dp))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = item.title,
                fontSize = 22.sp,
                fontWeight = FontWeight(500)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = item.title,
                fontSize = 16.sp,
                fontWeight = FontWeight(300)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ImageTextListITemPreview() {
    val model = ImageTitleSubtitleListItemModel(
        "https://picsum.photos/200",
        "title",
        "subtitle",
        "https://picsum.photos/100"
    )
    ImageTextListITem(model)
}
