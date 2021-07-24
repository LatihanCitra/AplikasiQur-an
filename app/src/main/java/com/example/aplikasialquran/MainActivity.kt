package com.example.aplikasialquran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnHijaiyyah.setOnClickListener {
            val intent = Intent(this, Huruf::class.java)
            startActivity(intent)
        }
        BtnNunSukun.setOnClickListener {
            val intent = Intent(this, NunSukundanTanwin::class.java)
            startActivity(intent)
        }
    }
}
