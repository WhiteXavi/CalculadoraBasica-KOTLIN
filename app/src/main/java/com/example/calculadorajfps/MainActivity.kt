package com.example.calculadorajfps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.Compiler.disable

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

        //Numeros que vamos a almacenar
        var firstNumber = 0;
        var secondNumber = 0;

        //El textView que se encarga de la operacion
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        //El historial de operaciones
        val textViewHistory = findViewById<TextView>(R.id.textViewHistory)

        //esto pone el text de operaciones con el numero correspondiente pero no añade el otro detras
        number0.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"0")
        }

        number1.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"1")
        }

        number2.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"2")
        }

        number3.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"3")
        }

        number4.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"4")
        }

        number5.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"5")
        }

        number6.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"6")
        }

        number7.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"7")
        }

        number8.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"8")
        }

        number9.setOnClickListener{
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,"9")
        }

        dot.setOnClickListener {
            val string1 = textViewOperation.text
            textViewOperation.text = concat(string1 as String,".")
        }

        plus.setOnClickListener{

            var string1 = textViewOperation.text
            var string2 = textViewHistory.text
            firstNumber = textViewOperation.text as Int;
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno
            textViewHistory.text = concat(string2 as String, string1 as String)
            string2 = textViewHistory.text
            textViewHistory.text = concat(string2 as String, " + ")
            textViewOperation.text = ""
            disable()
        }

        equal.setOnClickListener{

        }

        fun disable(){
            pow.isEnabled = false;
            root.isEnabled = false;
            minus.isEnabled = false;
            plus.isEnabled = false;
            multiply.isEnabled = false;
            divide.isEnabled = false;
        }

        fun enable(){
            pow.isEnabled = true;
            root.isEnabled = true;
            minus.isEnabled = true;
            plus.isEnabled = true;
            multiply.isEnabled = true;
            divide.isEnabled = true;
        }

        fun equal(v:View){
            var string1 = textViewOperation.text
            var string2 = textViewHistory.text
            textViewHistory.text = concat(string2 as String, string1 as String)
        }

    }

    fun clear(v:View){
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        textViewOperation.text = ""
    }

    fun clearAll(v:View){
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        val textViewHistory = findViewById<TextView>(R.id.textViewHistory)
        textViewOperation.text = ""
        textViewHistory.text = ""
    }

    fun concat(s1: String, s2: String): String {
        return s1 + s2
    }



}