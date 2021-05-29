package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_one)
        var backOne= findViewById<Button>(R.id.btnBack1)
        var nextOne= findViewById<Button>(R.id.btnNext1)
        backOne.setOnClickListener {
            var display1=Intent(baseContext,MainActivity::class.java)
            startActivity(display1)
        }
        nextOne.setOnClickListener {
            var display2= Intent(baseContext,PictureTwoActivity::class.java)
            startActivity(display2)
        }
    }
    }
