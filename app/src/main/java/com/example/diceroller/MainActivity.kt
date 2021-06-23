package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    var diceInt = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rndInt() }

        val clearButton: Button = findViewById(R.id.btnClear)
        clearButton.setOnClickListener{ ClearInt() }
    }

    private fun rndInt() {


        diceInt = (1..6).random()
        rollDice()


    }

    private fun ClearInt() {


        diceInt = 0
        rollDice()

    }

    private fun rollDice() {

        diceImage = findViewById(R.id.dice_image)

        val drawableResource = when (diceInt) {
            0 -> R.drawable.empty_dice
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
    }
}