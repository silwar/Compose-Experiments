package com.silwar.compose.extensions

fun Double.limitDecimal(limit: Int = 2): String {
    return String.format("%.${limit}f", this)
}