package com.example.mobileapp_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var DersHesapla=findViewById<TextView>(R.id.dersHesapla)

        DersHesapla.setOnClickListener(){
            val intent=Intent(this,VizeFinalCalc::class.java)
            startActivity(intent)
        }

    }
}