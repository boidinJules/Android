package com.example.myapplication14146

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
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
        btnRouge = findViewById(R.id.buttonrouge);
        btnBleu = findViewById(R.id.buttonviolet);
        btnVert = findViewById(R.id.buttonvert);
        myLayout = findViewById(R.id.FrameLayout);

        btnBleu.setOnClickListener {
            myLayout.setBackgroundColor(Color.BLUE)
            showToast("Il fait Bleu")
        }


        btnVert.setOnClickListener {
            myLayout.setBackgroundColor(Color.GREEN)
            showToast("Il fait Vert")
        }


        btnRouge.setOnClickListener {
            myLayout.setBackgroundColor(Color.RED)
            showToast("Il fait Rouge")
        }
    }

    private fun showToast(message: String) {
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}
