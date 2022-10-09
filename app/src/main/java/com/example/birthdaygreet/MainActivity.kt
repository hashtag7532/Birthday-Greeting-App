package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var createBirthdayButton : Button? = null
    private var nameInput : EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameInput = findViewById(R.id.nameInput)
        createBirthdayButton = findViewById(R.id.createBirthdayButton)
        createBirthdayButton?.setOnClickListener{
            val name = nameInput?.editableText.toString()
            val intent = Intent(this, BirthdayGreetingActivity::class.java)
            intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
            startActivity(intent)
        }
    }
}