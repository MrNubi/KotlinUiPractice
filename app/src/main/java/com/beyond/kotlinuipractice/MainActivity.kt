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

            TV1.setText("$inputMessage")
            //TextView는 .text로도 바꿀 수 있지만, EditText는 그거 안됨, setText()써야 함




        }

        Btn2_number.setOnClickListener{

           val Birth = ET2_number.text.toString().toInt()
            var k = 2022 - Birth +1

            Toast.makeText(this, "$k 살이시군요", Toast.LENGTH_SHORT).show()


            }

        }

    }
