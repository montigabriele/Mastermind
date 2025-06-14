package com.ingegneri.mastermind.models

import android.graphics.Color

data class Attempt(
    val guess: List<Color>,
    val correctPosition: Int,
    val correctColor: Int
)
