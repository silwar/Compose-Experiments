package com.silwar.compose.bottomsheet

import androidx.compose.animation.core.animateIntAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomSheetValue
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.rememberBottomSheetState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

enum class ExpandedType {
    HALF, FULL, COLLAPSED
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun BottomScaffoldSheet(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    var expandedType by remember {
        mutableStateOf(ExpandedType.HALF)
    }
//    var bottomSheetOption = remember { mutableStateOf(OPTIONS.SEARCH) }
    val height by animateIntAsState(
        when (expandedType) {
            ExpandedType.HALF -> screenHeight / 2
            ExpandedType.FULL -> screenHeight
            ExpandedType.COLLAPSED -> 70
        }
    )
    val bottomSheetScaffoldState = androidx.compose.material.rememberBottomSheetScaffoldState(
        bottomSheetState = rememberBottomSheetState(
            initialValue = BottomSheetValue.Collapsed
        )
    )
    androidx.compose.material.BottomSheetScaffold(
        sheetContent = {
            Image(imageVector = Icons.Default.Home, contentDescription = null)
        },
        sheetBackgroundColor = MaterialTheme.colors.primary,
        scaffoldState = bottomSheetScaffoldState, sheetPeekHeight = 0.dp
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Color.Black)
        )
    }
}