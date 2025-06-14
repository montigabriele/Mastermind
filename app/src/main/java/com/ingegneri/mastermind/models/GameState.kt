package com.ingegneri.mastermind.models

import com.ingegneri.mastermind.models.Colors.Color
import java.util.Date

var nextGameId: Int = 1

data class GameState(
    val id: Int = nextGameId++,
    val settings: GameSettings,
    val secretCode: List<Color>,
    val guesses: List<Guess> = listOf(),
    val isWon: Boolean = false,
    val isGameOver: Boolean = false,
    val date: Date = Date()
)