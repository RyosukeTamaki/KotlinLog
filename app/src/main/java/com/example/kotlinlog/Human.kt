package com.example.kotlinlog

import android.util.Log

class Human: Animal {

    // superで親クラスのコンストラクタを呼ぶ
    constructor(name: String, age: Int): super(name, age) {
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は〜〜です。年は〜〜歳です。")

         fun think() {
            Log.d("kotlintest", "私は〜〜について考える。")
             var hobby: String
        }
    }
}