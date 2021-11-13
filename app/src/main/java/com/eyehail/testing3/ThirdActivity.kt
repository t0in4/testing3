package com.eyehail.testing3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        findViewById<Button>(R.id.up).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).y -= 12
        }
        findViewById<Button>(R.id.down).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).y += 12
        }
        findViewById<Button>(R.id.left).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).x -= 12
        }
        findViewById<Button>(R.id.right).setOnClickListener{
            findViewById<ImageView>(R.id.imageView).x += 12
        }
        findViewById<Button>(R.id.visibility).setOnClickListener {
            if (findViewById<ImageView>(R.id.imageView).visibility == View.INVISIBLE) {
                findViewById<ImageView>(R.id.imageView).setVisibility(View.VISIBLE)
            } else {
                findViewById<ImageView>(R.id.imageView).setVisibility(View.INVISIBLE)
            }
        }
        findViewById<Button>(R.id.next3).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}