package com.example.mobileapp_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class VizeFinalCalc : AppCompatActivity() {
    var vizeNotu:Int=0
    var finalNotu:Int=0
    var sonuc:Int=0
    var durum:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vize_final_calc)
        var buttonCalc=findViewById<Button>(R.id.calc)
        var tvSonuc=findViewById<TextView>(R.id.twSonuc)

        buttonCalc.setOnClickListener(){

            sonuc= (vizeNotu*0.4 + finalNotu*0.6).toInt()

            if(sonuc>=50 && finalNotu>=50){
                    durum="Ders Verildi... ("+sonuc+")"
                } else {
                     durum="Ders Tekrarı!.. ("+sonuc+")"
                }

           tvSonuc.text=durum
        }

    }
}