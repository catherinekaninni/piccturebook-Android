package dev.kanini.pictureactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnnext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext=findViewById(R.id.btnnext)
        btnnext.setOnClickListener {
         val intent=Intent(this,MainActivity2::class.java)
         startActivity(intent)
        }
    }
}