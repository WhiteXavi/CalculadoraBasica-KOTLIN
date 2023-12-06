package com.example.calculadorajfps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.math.pow
import kotlin. math. sqrt

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
        var firstNumber = 0.0;
        var secondNumber = 0.0;
        //el operador
        var operator = "";
        //el resultado

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
            if(textViewOperation.text.equals("") || textViewOperation.text.equals(null)){
                firstNumber = 0.0
                textViewOperation.text = "0"
            }
            //Guardo el texto del primer numero
            var string1 = textViewOperation.text
            //Guardo el texto del historial de operaciones
            var string2 = textViewHistory.text
            //Guardo el primer numero como un double
            firstNumber = (textViewOperation.text as String).toDouble();
            //Guardo el operador que voy a usar
            operator = "+"
            //concateno las string con espacios para que se muestre separado
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno el historial con el primer numero para que se vea que operacion
            // se va a realizar
            textViewHistory.text = concat(string2 as String, string1 as String)
            //y ahora string2 sera el historial completo
            string2 = textViewHistory.text
            // le añado el operador + al historial
            textViewHistory.text = concat(string2 as String, " + ")
            //vacio el texto de operacion
            textViewOperation.text = ""
            //Deshabilito los botones
            disable()
        }

        minus.setOnClickListener{
            if(textViewOperation.text.equals("") || textViewOperation.text.equals(null)){
                firstNumber = 0.0
                textViewOperation.text = "0"
            }
            //Guardo el texto del primer numero
            var string1 = textViewOperation.text
            //Guardo el texto del historial de operaciones
            var string2 = textViewHistory.text
            //Guardo el primer numero como un double
            firstNumber = (textViewOperation.text as String).toDouble();
            //Guardo el operador que voy a usar
            operator = "-"
            //concateno las string con espacios para que se muestre separado
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno el historial con el primer numero para que se vea que operacion
            // se va a realizar
            textViewHistory.text = concat(string2 as String, string1 as String)
            //y ahora string2 sera el historial completo
            string2 = textViewHistory.text
            // le añado el operador + al historial
            textViewHistory.text = concat(string2 as String, " - ")
            //vacio el texto de operacion
            textViewOperation.text = ""
            //Deshabilito los botones
            disable()
        }

        multiply.setOnClickListener{
            if(textViewOperation.text.equals("") || textViewOperation.text.equals(null)){
                firstNumber = 0.0
                textViewOperation.text = "0"
            }
            //Guardo el texto del primer numero
            var string1 = textViewOperation.text
            //Guardo el texto del historial de operaciones
            var string2 = textViewHistory.text
            //Guardo el primer numero como un double
            firstNumber = (textViewOperation.text as String).toDouble();
            //Guardo el operador que voy a usar
            operator = "*"
            //concateno las string con espacios para que se muestre separado
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno el historial con el primer numero para que se vea que operacion
            // se va a realizar
            textViewHistory.text = concat(string2 as String, string1 as String)
            //y ahora string2 sera el historial completo
            string2 = textViewHistory.text
            // le añado el operador + al historial
            textViewHistory.text = concat(string2 as String, " x ")
            //vacio el texto de operacion
            textViewOperation.text = ""
            //Deshabilito los botones
            disable()
        }

        divide.setOnClickListener{
            if(textViewOperation.text.equals("") || textViewOperation.text.equals(null)){
                firstNumber = 0.0
                textViewOperation.text = "0"
            }
            //Guardo el texto del primer numero
            var string1 = textViewOperation.text
            //Guardo el texto del historial de operaciones
            var string2 = textViewHistory.text
            //Guardo el primer numero como un double
            firstNumber = (textViewOperation.text as String).toDouble();
            //Guardo el operador que voy a usar
            operator = "/"
            //concateno las string con espacios para que se muestre separado
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno el historial con el primer numero para que se vea que operacion
            // se va a realizar
            textViewHistory.text = concat(string2 as String, string1 as String)
            //y ahora string2 sera el historial completo
            string2 = textViewHistory.text
            // le añado el operador + al historial
            textViewHistory.text = concat(string2 as String, "/")
            //vacio el texto de operacion
            textViewOperation.text = ""
            //Deshabilito los botones
            disable()
        }

        pow.setOnClickListener{
            if(textViewOperation.text.equals("") || textViewOperation.text.equals(null)){
                firstNumber = 0.0
                textViewOperation.text = "0"
            }
            //Guardo el texto del primer numero
            var string1 = textViewOperation.text
            //Guardo el texto del historial de operaciones
            var string2 = textViewHistory.text
            //Guardo el primer numero como un double
            firstNumber = (textViewOperation.text as String).toDouble();
            //Guardo el operador que voy a usar
            operator = "pow"
            //concateno las string con espacios para que se muestre separado
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno el historial con el primer numero para que se vea que operacion
            // se va a realizar
            textViewHistory.text = concat(string2 as String, string1 as String)
            //y ahora string2 sera el historial completo
            string2 = textViewHistory.text
            // le añado el operador + al historial
            textViewHistory.text = concat(string2 as String, " ^ ")
            //vacio el texto de operacion
            textViewOperation.text = ""
            //Deshabilito los botones
            disable()
        }

        root.setOnClickListener{
            if(textViewOperation.text.equals("") || textViewOperation.text.equals(null)){
                firstNumber = 0.0
                textViewOperation.text = "0"
            }
            //Guardo el texto del primer numero
            var string1 = textViewOperation.text
            //Guardo el texto del historial de operaciones
            var string2 = textViewHistory.text
            //Guardo el primer numero como un double
            firstNumber = (textViewOperation.text as String).toDouble();
            //Guardo el operador que voy a usar
            operator = "sqrt"
            //concateno las string con espacios para que se muestre separado
            string2 = concat(string2 as String, " ")
            string1 = concat(string1 as String, " ")
            //concateno el historial con el primer numero para que se vea que operacion
            // se va a realizar
            textViewHistory.text = concat(string2 as String, string1 as String)
            //y ahora string2 sera el historial completo
            string2 = textViewHistory.text
            // le añado el operador + al historial
            textViewHistory.text = concat(string2 as String, " sqrt ")
            //vacio el texto de operacion
            textViewOperation.text = ""
            //Deshabilito los botones
            disable()
        }


        equal.setOnClickListener{
            if(operator.equals("+")){
                secondNumber = (textViewOperation.text as String).toDouble()
                var result = firstNumber+secondNumber
                var string1 = textViewHistory.text
                var string2 = textViewOperation.text
                string1 = concat(string1 as String, " ")
                string2 = concat(string2 as String, " = ")
                string2 = concat(string2 as String, result.toString())
                textViewHistory.text = concat(string1 as String, string2 as String)
                textViewOperation.text = result.toString()
                enable()
            }

            if(operator.equals("-")){
                secondNumber = (textViewOperation.text as String).toDouble()
                var result = firstNumber-secondNumber
                var string1 = textViewHistory.text
                var string2 = textViewOperation.text
                string1 = concat(string1 as String, " ")
                string2 = concat(string2 as String, " = ")
                string2 = concat(string2 as String, result.toString())
                textViewHistory.text = concat(string1 as String, string2 as String)
                textViewOperation.text = result.toString()
                enable()
            }

            if(operator.equals("*")){
                secondNumber = (textViewOperation.text as String).toDouble()
                var result = firstNumber*secondNumber
                var string1 = textViewHistory.text
                var string2 = textViewOperation.text
                string1 = concat(string1 as String, " ")
                string2 = concat(string2 as String, " = ")
                string2 = concat(string2 as String, result.toString())
                textViewHistory.text = concat(string1 as String, string2 as String)
                textViewOperation.text = result.toString()
                enable()
            }

            if(operator.equals("/")){
                secondNumber = (textViewOperation.text as String).toDouble()
                var result = firstNumber/secondNumber
                var string1 = textViewHistory.text
                var string2 = textViewOperation.text
                string1 = concat(string1 as String, " ")
                string2 = concat(string2 as String, " = ")
                string2 = concat(string2 as String, result.toString())
                textViewHistory.text = concat(string1 as String, string2 as String)
                textViewOperation.text = result.toString()
                enable()
            }

            if(operator.equals("pow")){
                secondNumber = (textViewOperation.text as String).toDouble()
                var result = firstNumber.pow(secondNumber)
                var string1 = textViewHistory.text
                var string2 = textViewOperation.text
                string1 = concat(string1 as String, " ")
                string2 = concat(string2 as String, " = ")
                string2 = concat(string2 as String, result.toString())
                textViewHistory.text = concat(string1 as String, string2 as String)
                textViewOperation.text = result.toString()
                enable()
            }

            if(operator.equals("sqrt")){
                var result = sqrt(firstNumber)
                var string1 = textViewHistory.text
                var string2 = textViewOperation.text
                string1 = concat(string1 as String, " ")
                string2 = concat(string2 as String, " = ")
                string2 = concat(string2 as String, result.toString())
                textViewHistory.text = concat(string1 as String, string2 as String)
                textViewOperation.text = result.toString()
                enable()
            }

        }

    }

    fun enable(){
        val plus = findViewById<Button>(R.id.btnPlus)
        val pow = findViewById<Button>(R.id.btnPow)
        val minus = findViewById<Button>(R.id.btnMinus)
        val multiply = findViewById<Button>(R.id.btnMultiply)
        val divide = findViewById<Button>(R.id.btnDivide)
        val root = findViewById<Button>(R.id.btnSquareRoot)
        pow.isEnabled = true;
        root.isEnabled = true;
        minus.isEnabled = true;
        plus.isEnabled = true;
        multiply.isEnabled = true;
        divide.isEnabled = true;
    }

    fun disable(){
        val plus = findViewById<Button>(R.id.btnPlus)
        val pow = findViewById<Button>(R.id.btnPow)
        val minus = findViewById<Button>(R.id.btnMinus)
        val multiply = findViewById<Button>(R.id.btnMultiply)
        val divide = findViewById<Button>(R.id.btnDivide)
        val root = findViewById<Button>(R.id.btnSquareRoot)
        pow.isEnabled = false;
        root.isEnabled = false;
        minus.isEnabled = false;
        plus.isEnabled = false;
        multiply.isEnabled = false;
        divide.isEnabled = false;
    }

    //Funcion para limpiar el texto de operacion
    fun clear(v:View){
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        textViewOperation.text = ""
    }

    //Funcion para limpiar el historial y texto de operacion
    fun clearAll(v:View){
        val textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        val textViewHistory = findViewById<TextView>(R.id.textViewHistory)
        textViewOperation.text = ""
        textViewHistory.text = ""
    }
    //Funcion para concatenar varias string
    fun concat(s1: String, s2: String): String {
        return s1 + s2
    }



}