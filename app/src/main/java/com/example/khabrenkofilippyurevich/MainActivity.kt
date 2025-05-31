package com.example.khabrenkofilippyurevich

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.view.View


class MainActivity : AppCompatActivity() {
    private var currentColorIndex = 0

    // Массив цветов в цикле
    private val colors = arrayOf(
        Color.parseColor("#FFA500"),
        Color.parseColor("#8A2BE2"),
        Color.parseColor("#808080")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorSquare = findViewById<View>(R.id.colorSquare)

        val switchButton = findViewById<Button>(R.id.switchColorButton)

        colorSquare.setBackgroundColor(colors[currentColorIndex])

        switchButton.setOnClickListener {
            currentColorIndex = (currentColorIndex + 1) % colors.size
            colorSquare.setBackgroundColor(colors[currentColorIndex])
        }
    }
}