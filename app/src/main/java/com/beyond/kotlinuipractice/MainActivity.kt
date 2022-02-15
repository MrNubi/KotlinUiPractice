package com.beyond.kotlinuipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Btn1.setOnClickListener {
            val inputMessage = ET1.text.toString()

            Toast.makeText(this, "$inputMessage", Toast.LENGTH_SHORT).show()




        }

    }
}