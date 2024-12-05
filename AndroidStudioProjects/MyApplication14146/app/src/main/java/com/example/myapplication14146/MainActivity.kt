package com.example.myapplication14146

import android.os.Bundle
import android.widget.ImageButton
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var ledButton: ImageButton
    private lateinit var myLayout: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisation du ImageButton et du FrameLayout
        ledButton = findViewById(R.id.ledButton)
        myLayout = findViewById(R.id.FrameLayout)

        // Événement pour changer l'image du toggle à chaque clic
        ledButton.setOnClickListener {
            // Si l'image actuelle est toggle_off, changer pour toggle_on et mettre led_on dans le FrameLayout
            if (ledButton.drawable.constantState == resources.getDrawable(R.drawable.toggle_off).constantState) {
                ledButton.setImageResource(R.drawable.toggle_on)  // Changer pour toggle_on
                myLayout.setBackgroundResource(R.drawable.led_on)  // Mettre led_on dans le FrameLayout
            } else {
                ledButton.setImageResource(R.drawable.toggle_off)  // Changer pour toggle_off
                myLayout.setBackgroundResource(R.drawable.led_off)  // Mettre led_off dans le FrameLayout
            }
        }
    }
}
