package com.ingegneri.mastermind.models

import androidx.compose.ui.graphics.Color

data class SavedGame(
    val settings: GameSettings,
    val secretCode: List<Color>,
    val attempts: List<Attempt>,
    val isComplete: Boolean,
    val savedAt: Long
)