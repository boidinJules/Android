package com.example.myapplication14146

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication14146.R

class MainActivity : AppCompatActivity() {
    private lateinit var btnRouge: Button
    private lateinit var btnVert: Button
    private lateinit var btnBleu: Button
    private lateinit var myLayout: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisation des boutons et du layout
        btnRouge = findViewById(R.id.buttonrouge)
        btnBleu = findViewById(R.id.buttonviolet)
        btnVert = findViewById(R.id.buttonvert)
        myLayout = findViewById(R.id.FrameLayout)

        // Événement pour le bouton bleu
        btnBleu.setOnClickListener {
            myLayout.setBackgroundResource(R.drawable.android_blue) // Image bleue
            showToast("Il fait Bleu")
        }

        // Événement pour le bouton vert
        btnVert.setOnClickListener {
            myLayout.setBackgroundResource(R.drawable.android_green) // Image verte
            showToast("Il fait Vert")
        }

        // Événement pour le bouton rouge
        btnRouge.setOnClickListener {
            myLayout.setBackgroundResource(R.drawable.android_red) // Image rouge
            showToast("Il fait Rouge")
        }
    }

    // Méthode pour afficher un message toast
    private fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.show()
    }
}
