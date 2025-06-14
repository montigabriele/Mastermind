package com.ingegneri.mastermind.models

import androidx.compose.ui.graphics.Color

object GameLogic {

    fun generateSecretCode(settings : GameSettings):List<Color>{

        val availableColors = GameColors.getRandomColors(settings.numColors)
        val secretCode = mutableListOf<Color>()

        if(settings.allowDuplicates){
            repeat(settings.codeLength){
                secretCode.add(availableColors.random())
            }
        } else {
            val shuffledColors = availableColors.shuffled()
            secretCode.addAll(shuffledColors.take(settings.codeLength))
        }
        return secretCode
    }

}