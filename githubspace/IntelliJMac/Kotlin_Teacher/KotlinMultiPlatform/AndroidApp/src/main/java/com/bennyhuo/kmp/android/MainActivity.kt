package com.bennyhuo.kmp.android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bennyhuo.kmp.doSomething
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.setOnClickListener {
            textView.text = doSomething()
        }
    }
}
