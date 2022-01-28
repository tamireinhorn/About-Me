package com.example.android.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener{
            addNickname(it)
        }
    }
    private fun addNickname(button: View){
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        nicknameTextView.text = editText.text // Sets the nickname as the text in the edit pane.
        editText.visibility = View.GONE
        button.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE //Hides the edit text and the button but now shows the nickname

    }
}



