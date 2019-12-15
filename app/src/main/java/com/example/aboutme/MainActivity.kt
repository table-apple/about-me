package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val doneButton: Button = findViewById(R.id.done_button)
        doneButton.setOnClickListener {
            displayNickname(it)
        }
    }

    private fun displayNickname(view: View){
        val nicknameField: TextView = findViewById(R.id.nickname_field)
        val nicknameDisplay = findViewById<TextView>(R.id.nickname_display)
        nicknameDisplay.text = nicknameField.text
        nicknameField.visibility = View.GONE
        view.visibility = View.GONE
        nicknameDisplay.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
