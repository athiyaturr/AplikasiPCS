package com.example.aplikasipcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNum1:EditText=findViewById(R.id.txtNumber1)
        val txtNum2:EditText=findViewById(R.id.txtNumber2)
        val btnAction:Button=findViewById(R.id.btnAction)
        var hasil:TextView=findViewById(R.id.txtHasil)

        btnAction.setOnClickListener{
            val num1=txtNum1.text.toString().toInt()
            val num2=txtNum2.text.toString().toInt()

            val tambah=num1+num2

            hasil.text=tambah.toString()
        }
    }
}