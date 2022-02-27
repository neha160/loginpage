package com.example.loginpage

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var website_et=findViewById<EditText>(R.id.edtURL)
        var website_btn=findViewById<Button>(R.id.btnURL)
        website_btn.setOnClickListener {
            var intent= Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(website_et.text.toString()))
            startActivity(intent)
        }
        var location_et=findViewById<EditText>(R.id.edtlocation)
        var location_btn=findViewById<Button>(R.id.btnmap)
        location_btn.setOnClickListener {
            var intent= Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("geo:0,0?q="+location_et.text.toString()))
            startActivity(intent)
        }
        var no=findViewById<EditText>(R.id.edtDial)
        var btndail = findViewById<Button>(R.id.btnDial)
        btndail.setOnClickListener{
            var intent= Intent()
            intent.setAction(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel: "+no.text.toString()))
            startActivity(intent)
        }
    }
}

