package com.example.baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.baseballgame.adapters.ChatAdapters

class MainActivity : BaseActivity() {

    val chatings=ArrayList<Chat>()
    var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        override fun setValues(){

            mChatAdapter=ChatAdapter
        }
    }
}
