package com.example.quiz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.startActivity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val txtmsg = findViewById<TextView>(R.id.txtmsg)
        val layout = findViewById<LinearLayout>(R.id.linearlayout)
        val resultado = findViewById<TextView>(R.id.resultado)

        btn3.setOnClickListener {
            layout.setBackgroundColor(Color.GREEN)
            txtmsg.text = "PARABÉNS RESPOSTA EXATA"
            txtmsg.setTextColor(Color.BLACK)
            resultado.setTextColor(Color.BLACK)
            cont=cont+soma
            resultado.text = "$cont"
            startActivity<MainActivity3>()
        }

        btn1.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
            txtmsg.text = "RESPOSTA ERRADA !!!"
            txtmsg.setTextColor(Color.WHITE)
            resultado.text = "0"
            startActivity<MainActivity3>()
        }

        btn2.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
            txtmsg.text = "RESPOSTA ERRADA !!!"
            txtmsg.setTextColor(Color.WHITE)
            resultado.text = "0"
            startActivity<MainActivity3>()
        }

        btn4.setOnClickListener {
            layout.setBackgroundColor(Color.RED)
            txtmsg.text = "RESPOSTA ERRADA !!!"
            txtmsg.setTextColor(Color.WHITE)
            resultado.text = "0"
            startActivity<MainActivity3>()
        }
    }
}