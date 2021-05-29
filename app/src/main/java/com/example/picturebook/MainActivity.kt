package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnNext= findViewById<Button>(R.id.btnPage1)
        btnNext.setOnClickListener {
            var display= Intent(baseContext,PictureOneActivity::class.java)
            startActivity(display)
        }

    }

}