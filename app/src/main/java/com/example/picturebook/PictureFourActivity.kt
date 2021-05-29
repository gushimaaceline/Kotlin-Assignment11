package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureFourActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_four)
        var pageFour= findViewById<Button>(R.id.btnBack4)
        var nextFour= findViewById<Button>(R.id.btnNext4)
        pageFour.setOnClickListener {
            var display6= Intent(baseContext,PictureFiveActivity::class.java)
            startActivity(display6)
        }
    }

}