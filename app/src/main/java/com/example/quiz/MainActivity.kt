package com.example.quiz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity
import android.text.Layout
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val txtmsg = findViewById<TextView>(R.id.txtmsg)
        val resultado = findViewById<TextView>(R.id.resultado)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)

        btn1.setOnClickListener {
            layout.setBackgroundColor(Color.GREEN)
            txtmsg.text = "PARABÉNS RESPOSTA EXATA"
            txtmsg.setTextColor(Color.BLACK)
            cont=cont+soma
            resultado.text = "$cont"
            startActivity<MainActivity2>()
        }

        btn2.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
            txtmsg.text = "PARABÉNS RESPOSTA EXATA"
            txtmsg.setTextColor(Color.BLACK)
            resultado.text = "$cont"
            startActivity<MainActivity2>()
        }

        btn3.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
            txtmsg.text = "PARABÉNS RESPOSTA EXATA"
            txtmsg.setTextColor(Color.BLACK)
            resultado.text = "$cont"
            startActivity<MainActivity2>()
        }

        btn4.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
            txtmsg.text = "PARABÉNS RESPOSTA EXATA"
            txtmsg.setTextColor(Color.BLACK)
            resultado.text = "$cont"
            startActivity<MainActivity2>()
        }
    }
}