package com.ingegneri.mastermind.models

import androidx.compose.ui.graphics.Color

data class Attempt(
    val guess: List<Color>,
    val correctPosition: Int,
    val correctColor: Int
)
