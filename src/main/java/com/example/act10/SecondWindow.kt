package com.example.act10

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.act10.R.id

class SecondWindow : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_window)

        val message = intent.getStringExtra ("EXTRA MESSAGE")
        val textView = findViewById<TextView>(id.textView).apply{
            text=message
        }
    }

}