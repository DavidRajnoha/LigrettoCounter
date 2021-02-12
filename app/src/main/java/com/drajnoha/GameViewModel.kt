package com.drajnoha

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel(){

    fun set_player1(player: String) {
        this.player1 = player
    }

    fun set_player2(player: String) {
        this.player2 = player
    }

    fun set_player3(player: String) {
        this.player3 = player
    }

    fun set_player4(player: String) {
        this.player4 = player
    }

    var player1 = ""
    var player2 = ""
    var player3 = ""
    var player4 = ""

    var score1 = 0
    var score2 = 0
    var score3 = 0
    var score4 = 0

    fun updateScore1(tableCount: Int, handCount: Int) {
        score1 += -2* tableCount + handCount
    }

}