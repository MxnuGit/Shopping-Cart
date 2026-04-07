package com.example.shoppingcart

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val itemList = ArrayList<String>()

        val editTxt = findViewById<EditText>(R.id.editTxt);
        val userBtn =  findViewById<Button>(R.id.addBtn);
        val RecyclerView = findViewById<RecyclerView>(R.id.list)
        val adapter = ItemAdapter(itemList)

        RecyclerView.adapter = adapter
        RecyclerView.layoutManager = LinearLayoutManager(this)


        userBtn.setOnClickListener {
            val text = editTxt.text.toString();

            if(!text.isEmpty()) {
                itemList.add(text)
                adapter.notifyDataSetChanged()
                editTxt.setText("")
            }
        }
    }
}