package com.ingegneri.mastermind.models

import androidx.compose.ui.graphics.Color

object GameColors {
    val red: Color = Color.Red
    val blue: Color = Color.Blue
    val green: Color = Color.Green
    val yellow: Color = Color.Yellow
    val purple: Color = Color(0xFF800080)
    val orange: Color = Color(0xFFFFA500)
    val brown: Color = Color(0xFF8D6E63)
    val pink: Color = Color(0xFFFFC0CB)
    val lime: Color = Color(0xFF8BC34A)
    val black: Color = Color.Black

    private val allColors =
        listOf(red, blue, green, yellow, purple, orange, brown, pink, lime, black)

    fun getRandomColors(count: Int): List<Color> =
        allColors.shuffled().take(count)
}

