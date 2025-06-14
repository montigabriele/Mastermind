package com.ingegneri.mastermind.models

import androidx.compose.ui.graphics.Color

data class GameColors(
    val red: Color = Color.Red,
    val blue: Color = Color.Blue,
    val green: Color = Color.Green,
    val yellow: Color = Color.Yellow,
    val purple: Color = Color(0xFF800080),
    val orange: Color = Color(0xFFFFA500),
    val cyan: Color = Color.Cyan,
    val brown: Color = Color(0xFF8D6E63),
    val pink: Color = Color(0xFFFFC0CB),
    val lime: Color = Color(0xFF8BC34A),
    val empty: Color = Color.Gray,
    val black: Color = Color.Black
) {
    fun getColors(count: Int) = listOf(red, blue, green, yellow, purple, orange, cyan, brown, pink, lime).take(count)
}