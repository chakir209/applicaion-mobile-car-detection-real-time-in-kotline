package com.programminghut.realtime_object

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_details)
        var vNext = findViewById<Button>(R.id.nextBtn)

        vNext.setOnClickListener {
            Intent(this,SigninActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}