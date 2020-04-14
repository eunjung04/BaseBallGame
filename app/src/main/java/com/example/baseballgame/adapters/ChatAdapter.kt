package com.example.baseballgame.adapters

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import com.example.baseballgame.BaseActivity

class MainActivity : BaseActivity() {

    val chatings = ArrayList<Chat>()
    var mChatAdapter:ChatAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        @@ -19,6 +25,13 @@ class MainActivity : BaseActivity() {

            override fun setValues() {

                chatings.add(Chat("숫자 야구게임에 오신걸 환영합니다.", "COMPUTER"))
                chatings.add(Chat("세자리 숫자를 맞춰주세요.", "COMPUTER"))
                chatings.add(Chat("중복된 숫자는 없고, 0도 사용되지 않습니다.", "COMPUTER"))

                mChatAdapter = ChatAdapter(mContext, R.layout.chat_list_item, chatings)
                chatListView.adapter = mChatAdapter

            }

        }


