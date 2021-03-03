package com.example.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    override fun onStart() {
        super.onStart()

        Toast.makeText(this,"open Third Activity", Toast.LENGTH_SHORT).show()


        findViewById<Button>(R.id.btn_back_thied).setOnClickListener {
            finish()
        }
    }
}