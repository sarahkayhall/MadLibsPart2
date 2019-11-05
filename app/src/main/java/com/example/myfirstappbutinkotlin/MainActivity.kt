package com.example.myfirstappbutinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val message = editText11.text.toString()
        val message2 = editText12.text.toString()
        val message3 = editText13.text.toString()
        val message4 = editText14.text.toString()
        val message5 = editText15.text.toString()
        val message6 = editText16.text.toString()
        val message7 = editText17.text.toString()
        val message8 = editText18.text.toString()
        val message9 = editText19.text.toString()
        val message10 = editText21.text.toString()
        val message11 = editText22.text.toString()

        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
            putExtra("EXTRA_MESSAGE2", message2)
            putExtra("EXTRA_MESSAGE3", message3)
            putExtra("EXTRA_MESSAGE4", message4)
            putExtra("EXTRA_MESSAGE5", message5)
            putExtra("EXTRA_MESSAGE6", message6)
            putExtra("EXTRA_MESSAGE7", message7)
            putExtra("EXTRA_MESSAGE8", message8)
            putExtra("EXTRA_MESSAGE9", message9)
            putExtra("EXTRA_MESSAGE10", message10)
            putExtra("EXTRA_MESSAGE11", message11)
        }
        startActivity(intent)
    }
}
