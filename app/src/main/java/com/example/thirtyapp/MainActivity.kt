package com.example.thirtyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // our frist project in Githup

        val text_view = findViewById<EditText>(R.id.text_view)
        val click_btn = findViewById<Button>(R.id.click_btn)
        val ImageView = findViewById<ImageView>(R.id.imageView)


    }
}
