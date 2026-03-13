package com.example.shoppingcart

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val editTxt = findViewById<EditText>(R.id.editTxt);
        val userBtn =  findViewById<Button>(R.id.addBtn);
        val itemList = ArrayList<String>()

        userBtn.setOnClickListener {
            val text = editTxt.text.toString();
            itemList.add(text)
            Log.d("item", "$itemList")
            editTxt.setText("")
        }
    }
}