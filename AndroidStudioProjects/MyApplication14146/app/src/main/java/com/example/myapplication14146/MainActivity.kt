package com.example.myapplication14146

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import android.view.Gravity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnRouge: Button
    private lateinit var btnVert: Button
    private lateinit var btnBleu: Button
    private lateinit var myLayout: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisation des vues
        btnRouge = findViewById(R.id.buttonRouge)
        btnVert = findViewById(R.id.buttonVert)
        btnBleu = findViewById(R.id.buttonBleu)
        myLayout = findViewById(R.id.panelCouleur)

        // OnClickListener pour le bouton Bleu
        btnBleu.setOnClickListener {
            myLayout.setBackgroundColor(Color.BLUE)
            val myToast = Toast.makeText(this, "Il fait Bleu", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        }

        // OnClickListener pour le bouton Vert
        btnVert.setOnClickListener {
            myLayout.setBackgroundColor(Color.GREEN)
            val myToast = Toast.makeText(this, "Il fait Vert", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        }

        // OnClickListener pour le bouton Rouge
        btnRouge.setOnClickListener {
            myLayout.setBackgroundColor(Color.RED)
            val myToast = Toast.makeText(this, "Il fait Rouge", Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER, 0, 0)
            myToast.show()
        }
    }
}
