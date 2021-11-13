package com.eyehail.testing3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.result).setOnClickListener {
            if (findViewById<EditText>(R.id.first).text.toString().trim().length > 0 &&
                findViewById<EditText>(R.id.second).text.toString().trim().isNotEmpty()
            ) {
                findViewById<EditText>(R.id.third).setText(
                    (findViewById<EditText>(R.id.first).text.toString().toInt()
                            + findViewById<EditText>(R.id.second).text.toString()
                        .toInt()).toString()
                )
                findViewById<EditText>(R.id.four).setText(
                    "${findViewById<EditText>(R.id.first).text} + " +
                            "${findViewById<EditText>(R.id.second).text} = ${findViewById<EditText>(R.id.third).text}"
                )
            } else {
                findViewById<EditText>(R.id.four).setText("please write digits")
            }
        }
        findViewById<Button>(R.id.next2).setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }


    }
}