package com.example.calculadorajfps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Guardo todos los numeros de la calculadora
        val number0 = findViewById<Button>(R.id.btnNumber0)
        val number1 = findViewById<Button>(R.id.number1)
        val number2 = findViewById<Button>(R.id.number2)
        val number3 = findViewById<Button>(R.id.number3)
        val number4 = findViewById<Button>(R.id.number4)
        val number5 = findViewById<Button>(R.id.number5)
        val number6 = findViewById<Button>(R.id.number6)
        val number7 = findViewById<Button>(R.id.number7)
        val number8 = findViewById<Button>(R.id.number8)
        val number9 = findViewById<Button>(R.id.number9)

        //Los demas botones de la calculadora
        val dot = findViewById<Button>(R.id.btnDot)
        val equal = findViewById<Button>(R.id.btnEquals)
        val plus = findViewById<Button>(R.id.btnPlus)
        val pow = findViewById<Button>(R.id.btnPow)
        val minus = findViewById<Button>(R.id.btnMinus)
        val multiply = findViewById<Button>(R.id.btnMultiply)
        val divide = findViewById<Button>(R.id.btnDivide)
        val root = findViewById<Button>(R.id.btnSquareRoot)
        val clear = findViewById<Button>(R.id.btnClear)
        val clearAll = findViewById<Button>(R.id.btnClearAll)

        //El textView que se encarga de la operacion
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)

        number0.setOnClickListener{
            textViewOperation.setText("0")
        }

        number1.setOnClickListener{
            textViewOperation.setText("1")
        }

        number2.setOnClickListener{
            textViewOperation.setText("2")
        }

        number3.setOnClickListener{
            textViewOperation.setText("3")
        }

        number4.setOnClickListener{
            textViewOperation.setText("4")
        }

        number5.setOnClickListener{
            textViewOperation.setText("5")
        }

        number6.setOnClickListener{
            textViewOperation.setText("6")
        }

        number7.setOnClickListener{
            textViewOperation.setText("7")
        }

        number8.setOnClickListener{
            textViewOperation.setText("8")
        }

        number9.setOnClickListener{
            textViewOperation.setText("9")
        }

        dot.setOnClickListener {
            textViewOperation.setText(".")
        }

    }

    fun equal(v: View){
        val textViewHistory = findViewById<TextView>(R.id.textViewHistory)
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)

    }

    fun plus(v: View){
        val textViewHistory = findViewById<TextView>(R.id.textViewHistory)
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        val operation = textViewOperation.text
        textViewHistory.setText(operation)
    }

}