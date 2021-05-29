package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_three)
        var page3= findViewById<Button>(R.id.btnBack3)
        var next3= findViewById<Button>(R.id.btnNext3)
        page3.setOnClickListener {
            var display5= Intent(baseContext,PictureFourActivity::class.java)
            startActivity(display5)
        }
    }
}