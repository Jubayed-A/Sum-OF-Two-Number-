package com.example.sumoftwonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<EditText>(R.id.ed1)
        val secondNum = findViewById<EditText>(R.id.ed2)
        val outPut = findViewById<TextView>(R.id.tvDisplay)
        val sumButton = findViewById<Button>(R.id.btnSum)

        sumButton.setOnClickListener {
            val val1 = firstNum.text.toString().toInt()
            val val2 = secondNum.text.toString().toInt()
            val result = val1 + val2

//            outPut.text = result.toString()
            outPut.setText(result.toString())
            Toast.makeText(this, result,Toast.LENGTH_SHORT).show()

        }

    }
}


