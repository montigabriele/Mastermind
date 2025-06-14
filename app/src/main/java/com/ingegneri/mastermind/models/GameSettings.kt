package com.ingegneri.mastermind.models

data class GameSettings(
    val numColors: Int,
    val codeLength: Int,
    val allowDuplicates: Boolean
)