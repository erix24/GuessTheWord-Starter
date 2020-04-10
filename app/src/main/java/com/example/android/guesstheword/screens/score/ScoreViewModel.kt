package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 ** create by ErixJavier on  5/04/20.
 */
class ScoreViewModel(finalScore:Int):ViewModel() {

    private var _score = MutableLiveData<Int>()
    val score: LiveData<Int>
    get() = _score

    private var _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain:LiveData<Boolean>
    get() = _eventPlayAgain

    init {
        _score.value = finalScore
        Log.i("ScorellViewModel","Final Score is $finalScore")
    }

    fun onPlayAgain(){
        _eventPlayAgain.value = true
    }

    fun onPlayAgainComplete(){
        _eventPlayAgain.value = false
    }
}