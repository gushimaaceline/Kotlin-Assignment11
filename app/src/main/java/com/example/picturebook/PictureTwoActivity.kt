package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_two)
        var pageTwo= findViewById<Button>(R.id.btnBack2)
        var next2= findViewById<Button>(R.id.btnNext2)
        pageTwo.setOnClickListener {
           var display3= Intent(baseContext,PictureOneActivity::class.java)
            startActivity(display3)
        }
     next2.setOnClickListener {
         var display4= Intent(baseContext,PictureThreeActivity::class.java)
         startActivity(display4)
     }
    }
}
