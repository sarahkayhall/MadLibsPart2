package com.example.myfirstappbutinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_display_message.*

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val message2 = intent.getStringExtra("EXTRA_MESSAGE2")
        val message3 = intent.getStringExtra("EXTRA_MESSAGE3")
        val message4 = intent.getStringExtra("EXTRA_MESSAGE4")
        val message5 = intent.getStringExtra("EXTRA_MESSAGE5")
        val message6 = intent.getStringExtra("EXTRA_MESSAGE6")

        // Capture the layout's TextView and set the string as its text
        val story = "So there's this "
        val story2 = "It knows how to code in "
        val story3 = "Surprising right? Well here's the thing..."
        val story4 = "It only codes in "
        val story5 = "Though sometimes it also codes in "
        val story6 = "Confusing sometimes, I know."
        val story7 = "But the question is... how did it learn?"
        val story8 = "Ah yes let me tell the tale..."
        val story9 = "One day when "
        val story10 = "was out for a "
        val story11 = " walk,"
        val story12 = "trying to come up with yet another program to make their students "
        val story13 = "they stumbled upon this "
        val story14 = "living in a "

        textView4.text = story
        textView6.text = story2
        textView9.text = message
        textView7.text = message2
        textView10.text = story3
        textView11.text = story4
        textView12.text = message3

    }
}
