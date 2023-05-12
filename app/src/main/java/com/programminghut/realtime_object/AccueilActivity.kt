package com.programminghut.realtime_object

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccueilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accueil)


        var Btn = findViewById<Button>(R.id.landingBtn)

        Btn.setOnClickListener {
            Intent(this,FirstDetailsActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}