package com.example.massirimalemonade

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val list = listOf(R.drawable.lemon_squeeze , R.drawable.lemon_drink , R.drawable.lemon_restart, R.drawable.lemon_tree)
    private var index = 0
    var text1 = ("Tap the lemon tree to select a lemon")
    var text2 = ("Keep tapping the lemon to squeeze it")
    var text3= ("Tap the lemonade to drink itn")
    var text4 = ("Tap the empty glass to start again")
    val ttx = listOf( text2 , text3 , text4 , text1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val txte: TextView = findViewById(R.id.textV)
        val Img: ImageView = findViewById(R.id.imageView)
        Img.setOnClickListener {
            index++
            if( index >= list.count())
                index = 0
            Img.setImageResource(list[index])
            txte.setText(ttx[index])


    }}}
