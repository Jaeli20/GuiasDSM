package com.example.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSumar = findViewById<Button>(R.id.btnSumar)
        val edit1 = findViewById<EditText>(R.id.et1)
        val edit2 = findViewById<EditText>(R.id.et2)
        val view2 = findViewById<TextView>(R.id.tv1)
        val btnDividir = findViewById<Button>(R.id.btnDividir)
        val btnRestar = findViewById<Button>(R.id.btnRestar)
        val btnMulti = findViewById<Button>(R.id.btnMulti)



        btnSumar.setOnClickListener {
            view2.text = "Resultado: ${
                edit1.text.toString().toInt() + edit2.text.toString().toInt()
            }"
        }

        btnDividir.setOnClickListener {
            view2.text = "Resultado: ${
                edit1.text.toString().toInt() / edit2.text.toString().toInt()
            }"
        }

        btnMulti.setOnClickListener {


            view2.text = "Resultado: ${
                edit1.text.toString().toInt() * edit2.text.toString().toInt()
            }"
        }

        btnRestar.setOnClickListener {

            view2.text = "Resultado: ${
                edit1.text.toString().toInt() - edit2.text.toString().toInt()
            }"
        }

    }
}
