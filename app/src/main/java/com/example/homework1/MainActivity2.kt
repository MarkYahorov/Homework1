package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,"open Second Activity",Toast.LENGTH_SHORT).show()

        findViewById<Button>(R.id.btn_back_sec).setOnClickListener {
            finish()
        }

    }
}