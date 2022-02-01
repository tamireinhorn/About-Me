package com.example.android.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.android.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName(name = "Vitor Botelho de Souza") //Instantiate the class with nickname empty.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName
        binding.doneButton.setOnClickListener { addNickname(it) }
    }
    private fun addNickname(button: View){
        binding.apply { //Saves us from having to constantly reference the binding.
            myName?.nickname =  nicknameEdit.text.toString() // Sets the nickname as the text in the edit pane. Modifies the class.
            invalidateAll() // Refreshes the bindings.
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE //Hides the edit text and the button but now shows the nickname }

            // Hide the keyboard.
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(button.windowToken, 0)
        }
    }
}



