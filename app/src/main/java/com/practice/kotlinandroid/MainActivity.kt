package com.practice.kotlinandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

val MainActivity.tv2: TextView
    get() = findViewById(R.id.tv)
var HAHA: String
    set(value) {
        Log.e("TAG", value)
    }
    get() = "hello"


class MainActivity : AppCompatActivity() {
    val TAG: String = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.visibility = View.VISIBLE;
        tv.text = "haha"
        tv2.text = "haha2"
        tv2.setOnClickListener { (it as TextView).text = "haha3" }
        HAHA = "test"
    }


    override fun onResume() {
        super.onResume()
    }
}
