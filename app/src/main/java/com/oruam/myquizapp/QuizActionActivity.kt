package com.oruam.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizActionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_action)

        val questionsList = Constants.getQuestions()
        Log.i("QuestionsList size is ", "${questionsList.size}")
    }
}