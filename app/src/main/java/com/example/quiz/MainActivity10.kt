package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.jetbrains.anko.startActivity

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val btnfim = findViewById<Button>(R.id.btnfim)
        val txtfim = findViewById<TextView>(R.id.txtfim)
        val txttks = findViewById<TextView>(R.id.txttks)
        val btn_inicio = findViewById<Button>(R.id.btn_inicio)

        btnfim.setOnClickListener{
            txtfim.text = "$cont Pontos"
            txttks.text = "OBRIGADO POR BRINCAR COM A GENTE"
        }
        btn_inicio.setOnClickListener {
            0.also { cont = it }
            startActivity<MainActivity>()
        }
    }
}