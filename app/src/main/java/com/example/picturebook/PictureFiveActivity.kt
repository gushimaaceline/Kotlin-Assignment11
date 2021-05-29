package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_five)
        var page5= findViewById<Button>(R.id.btnBack5)
        page5.setOnClickListener {
            var display6= Intent(baseContext,PictureFourActivity::class.java)
            startActivity(display6)
        }
    }
}