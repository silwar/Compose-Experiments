package com.silwar.compose.list.localdata

import com.silwar.compose.list.model.BigImageTextListItemModel
import com.silwar.compose.list.model.HorizontalRemoteImageListItemModel
import com.silwar.compose.list.model.ImageTitleSubtitleListItemModel

val list1: LinkedHashMap<String, List<Any>> = linkedMapOf(
    "January 2024" to listOf(
        HorizontalRemoteImageListItemModel(
            horizontalRemoteImageListData(10)
        ),
        randomImageTitleSubtitleListItem(),
        "Amazon Inc."
    ),
    "February 2024" to listOf(
        "Myntra", "Google Pay", "Amazon Inc.",
        "McDonalds", "Cafe Coffee Day", "Flipkart"
    ),
    "March 2024" to listOf("Mytra", "Flipkart"),
    "April 2024" to listOf(
        "Myntra",
        "Google Pay",
        "Amazon Inc.",
        "McDonalds",
        "Cafe Coffee Day",
        HorizontalRemoteImageListItemModel(
            horizontalRemoteImageListData(5)
        ),
    ),
    "May 2024" to listOf(
        "Myntra", "Google Pay", "Amazon Inc.",
        "McDonalds",
        bigImageTextListItemData(),
        "Flipkart"
    ),
    "June 2024" to listOf(
        "Myntra",
        "Google Pay",
        "Amazon Inc.",
        bigImageTextListItemData(),
        bigImageTextListItemData(),
        "Flipkart"
    ),
    "July 2024" to listOf(
        "Myntra", "Google Pay", "Amazon Inc.",
        "McDonalds", "Cafe Coffee Day", "Flipkart"
    ),
    "August 2024" to listOf(
        randomImageTitleSubtitleListItem(), "Google Pay", "Amazon Inc.",
        "McDonalds", "Cafe Coffee Day", randomImageTitleSubtitleListItem()
    ),
    "September 2024" to listOf(
        "Myntra", "Google Pay", "Amazon Inc.",
        "McDonalds", randomImageTitleSubtitleListItem(), randomImageTitleSubtitleListItem()
    ),
    "October 2024" to listOf(
        "Myntra", "Google Pay", "Amazon Inc.",
        "McDonalds", "Cafe Coffee Day", "Flipkart"
    ),
    "November 2024" to listOf(
        "Myntra", "Google Pay", "Amazon Inc.",
        randomImageTitleSubtitleListItem(), "Cafe Coffee Day", "Flipkart"
    ),
    "December 2024" to listOf(
        "Myntra",
        "Google Pay",
        randomImageTitleSubtitleListItem(),
        "McDonalds",
        HorizontalRemoteImageListItemModel(
            horizontalRemoteImageListData(10)
        ),
        bigImageTextListItemData()
    ),
)

fun horizontalRemoteImageListData(count: Int) = buildList {
    for (i in 0..count) {
        add("https://picsum.photos/600/400")
    }
}

fun bigImageTextListItemData() = BigImageTextListItemModel(
    "https://picsum.photos/800",
    "Title"
)

fun randomImageTitleSubtitleListItem(): ImageTitleSubtitleListItemModel {
    return ImageTitleSubtitleListItemModel(
        "https://picsum.photos/200",
        "Title",
        "Subtitle",
        "https://picsum.photos/100"
    )
}
