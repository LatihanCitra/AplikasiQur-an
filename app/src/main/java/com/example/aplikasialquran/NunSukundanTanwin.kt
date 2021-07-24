package com.example.aplikasialquran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_nun_sukundan_tanwin.*

class NunSukundanTanwin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nun_sukundan_tanwin)
        BtnIkhfa.setOnClickListener {
            val intent = Intent(this, Ikfa::class.java)
            startActivity(intent)
        }
        BtnIzhar.setOnClickListener {
            val intent = Intent(this, Izhar::class.java)
            startActivity(intent)
        }
        BtnIdghamBighunnah.setOnClickListener {
            val intent = Intent(this, IdghamBighunnah::class.java)
            startActivity(intent)
        }
    }
}
