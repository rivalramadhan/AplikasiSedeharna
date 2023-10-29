package com.example.aplikasisederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun submit(view: View) {
        val value = findViewById<EditText>(R.id.field)
        val nama = value.text.toString()
        val toast = Toast.makeText(applicationContext, nama, Toast.LENGTH_SHORT)
        toast.show()
    }
    fun clear(view: View) {
        val value = findViewById<EditText>(R.id.field)
        value.setText("")
    }
}