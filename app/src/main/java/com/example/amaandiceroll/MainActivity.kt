package com.example.amaandiceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button =findViewById(R.id.button2)
        rollButton.setOnClickListener{diceRoll()}
    }

    private fun diceRoll() {
       val dice=Dice(6)
       val diceRoll=dice.roll()

        val resultTextView: TextView =findViewById(R.id.textView)
        resultTextView.text=diceRoll.toString()
        val diceRoll2=dice.roll()

        val resultTextView1: TextView=findViewById(R.id.textView2)
        resultTextView1.text=diceRoll2.toString()


    }
    class Dice(private val numSides: Int){
        fun roll():Int{
            return(1..numSides).random()
        }
    }
}