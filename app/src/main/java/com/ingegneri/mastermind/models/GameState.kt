package com.ingegneri.mastermind.models

import androidx.compose.ui.graphics.Color
import java.util.Date

var nextGameId: Int = 1

data class GameState(
    val id: Int = nextGameId++,
    val settings: GameSettings,
    val secretCode: List<Color>,
    val attempts: List<Attempt> = listOf(),
    val isWon: Boolean = false,
    val isGameOver: Boolean = false,
    val date: Date = Date()
)