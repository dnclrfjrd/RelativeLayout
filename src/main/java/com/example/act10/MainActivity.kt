package com.example.act10

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener { callActivity()
        }
    }
    private fun callActivity () {
        val editText = findViewById<EditText>(R.id.text)
        val message = editText.text.toString()

        val intent = Intent(this,SecondWindow::class.java).also{
            it.putExtra("EXTRA MESSAGE", message)
            startActivity(it)
        }

    }
}