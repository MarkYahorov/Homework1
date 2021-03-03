package com.example.homework1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CompoundButton
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        click()
    }

    private fun click(){
        val nextSecActivity = findViewById<TextView>(R.id.go_sec)
        nextSecActivity.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }
        val nextThirdActivity = findViewById<TextView>(R.id.go_third)
        nextThirdActivity.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }

        val send = findViewById<Button>(R.id.send).setOnClickListener {
            startActivity(Intent(Intent.ACTION_SEND))

        }

        val findShare = findViewById<Button>(R.id.share).setOnClickListener {
            var sendIntent = Intent(Intent.ACTION_SEND).
            putExtra(Intent.EXTRA_TEXT,"Держи, это мое приложение, если захочешь скачать, " +
                                            " то подойди и лично попроси, скину, ссылку не дам :)")
                    .setType("text/plain")

            startActivity(Intent.createChooser(sendIntent, "Send"))
        }

        val btn_4 = findViewById<Button>(R.id.button_4)
        btn_4.setOnClickListener {
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }

    }




}