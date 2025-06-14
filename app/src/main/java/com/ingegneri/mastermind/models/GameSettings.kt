package com.ingegneri.mastermind.models

data class GameSettings(
    val numColors: Int,
    val codeLength: Int,
    val allowDuplicates: Boolean
)

object GameSettingsFactory {
    fun getAllSettings(): List<GameSettings>{
        val numColorsOptions = listOf(6, 8, 10)
        val codeLenghtOptions = listOf(4, 5)
        val allowDuplicatesOptions = listOf(true, false)

        val settings = mutableListOf<GameSettings>()

        for (numColors in numColorsOptions) {
            for (codeLength in codeLenghtOptions) {
                for (allowDuplicates in allowDuplicatesOptions) {
                    settings.add(GameSettings(numColors, codeLength, allowDuplicates))
                }
            }
        }
        return settings
    }
}