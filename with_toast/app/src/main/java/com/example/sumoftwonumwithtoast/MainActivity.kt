package com.example.sumoftwonumwithtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNum = findViewById<EditText>(R.id.editTextText)
        val seconNum = findViewById<EditText>(R.id.editTextText2)
        val output = findViewById<Button>(R.id.button)

        output.setOnClickListener {

            val val1 = firstNum.text.toString().toInt()
            val val2 = seconNum.text.toString().toInt()

            val result = val1 + val2

            Toast.makeText(this, result.toString(),Toast.LENGTH_SHORT).show()

        }


    }
}