package com.example.khabrenkofilippyurevich

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var currentColorIndex = 0
    private lateinit var numberTextView: TextView
    private lateinit var changeButton: Button
    private var currentNumber = 3
    // Массив цветов в цикле
    private val colors = arrayOf(
        Color.parseColor("#FFA500"),
        Color.parseColor("#8A2BE2"),
        Color.parseColor("#808080")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //квадрат
        val colorSquare = findViewById<View>(R.id.colorSquare)

        val switchButton = findViewById<Button>(R.id.switchColorButton)

        colorSquare.setBackgroundColor(colors[currentColorIndex])

        switchButton.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            colorSquare.setBackgroundColor(colors[currentColorIndex])

            // цифры
        numberTextView = findViewById(R.id.numberTextView)
        changeButton = findViewById(R.id.changeButton)
        numberTextView.text = currentNumber.toString()
        changeButton.setOnClickListener {
            if (currentNumber < 15) {
                currentNumber += 3  // увеличиваем на 3
            } else {
                currentNumber = 3   // возвращаем к 3, если достигли 15 или больше
            }
            numberTextView.text = currentNumber.toString()
        }



        }
    }
}