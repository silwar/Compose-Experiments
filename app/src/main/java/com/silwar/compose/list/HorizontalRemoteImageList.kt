package com.silwar.compose.list

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.silwar.compose.list.model.HorizontalRemoteImageListItemModel

@Composable
fun HorizontalRemoteImageList(
    model: HorizontalRemoteImageListItemModel,
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .padding(16.dp)
    ) {
        items(model.itemList) {
            AsyncImage(
                model = it,
                contentDescription = null,
                modifier = Modifier
                    .aspectRatio(1.5f)
                    .height(100.dp)
                    .clip(shape = RoundedCornerShape(16.dp))
            )
        }
    }
}