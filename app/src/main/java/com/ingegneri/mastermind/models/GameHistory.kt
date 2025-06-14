package com.ingegneri.mastermind.models

data class GameHistory(
    val gameState: GameState,
    val totalAttempts: Int,
    val wasWon: Boolean
)