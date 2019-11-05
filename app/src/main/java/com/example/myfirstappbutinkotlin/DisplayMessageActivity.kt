package com.example.myfirstappbutinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_display_message.*
import kotlinx.android.synthetic.main.activity_main.*

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
        val message7 = intent.getStringExtra("EXTRA_MESSAGE7")
        val message8 = intent.getStringExtra("EXTRA_MESSAGE8")
        val message9 = intent.getStringExtra("EXTRA_MESSAGE9")
        val message10 = intent.getStringExtra("EXTRA_MESSAGE10")
        val message11 = intent.getStringExtra("EXTRA_MESSAGE11")

        // Capture the layout's TextView and set the string as its text
        val story = "So there's this "
        val story2 = "It knows how to code in "
        val story3 = "Surprising right? Well here's the thing..."
        val story4 = "It only codes in a"
        val story5 = "Though sometimes it also codes in "
        val story6 = "Confusing sometimes, I know."
        val story7 = "But the question is... how did it learn?"
        val story8 = "Ah yes let me tell the tale..."
        val story9 = "One day when "
        val story10 = "was out for a "
        val story11 = " walk,"
        val story12 = "trying to come up with yet another program to make SITC students "
        val story13 = "they stumbled upon this object living in a "
        val story14 = "They decided to take it to "
        val story15 = "and teach it their trade of computers."
        val story16 = "I mean that's really all the story."
        val story17 = "I know, not as exciting as you had hoped."
        val story18 = "But the "+ message +" and " + message5 + " stayed in touch."
        val story19 = "They still meet"
        val story20 = "every"
        val story21 = "weeks."
        val story22 = "Ask " + message5 + " about it..."
        val story23 = "I'm sure they would love to share the tale."
        val story24 = "Okay now quit procrastinating and go work on that program we all know you need to finish."


        textView4.text = story
        textView6.text = story2
        textView9.text = message
        textView7.text = message2
        textView10.text = story3
        textView11.text = story4
        textView12.text = message3
        textView13.text = story5
        textView14.text = message4
        textView15.text = story6
        textView16.text = story7
        textView17.text = story8
        textView18.text = story9
        textView19.text = message5
        textView20.text = story10
        textView26.text = message6
        textView21.text = story11
        textView27.text = story12
        textView28.text = message7
        textView29.text = story13
        textView30.text = message8
        textView32.text = story14
        textView33.text = message9
        textView31.text = story15
        textView34.text = story16
        textView35.text = story17
        textView36.text = story18
        textView38.text = story19
        textView37.text = message10
        textView39.text = story20
        textView45.text = message11
        textView41.text = story21
        textView43.text = story22
        textView42.text = story23
        textView44.text = story24



    }
}
