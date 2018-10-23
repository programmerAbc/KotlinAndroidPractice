package com.practice.kotlinandroid

import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

val MainActivity.tv2: TextView
    get() = findViewById(R.id.tv)
var HAHA: String = ""
    set(value) {
        Log.e("TAG", value)
    }
    get() {
        Log.e("TAG", field)
        return "hello"
    }


class MainActivity : AppCompatActivity() {
    val TAG: String = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.visibility = View.VISIBLE;
        tv.text = "haha"
        tv2.text = "haha2"
        tv2.setOnClickListener { v: View ->
            AlertDialog.Builder(this@MainActivity)
                .setMessage("haha")
                .setPositiveButton("ok") { v1, v2 ->
                    Toast.makeText(this@MainActivity, "Positive", Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("cancel") { v1, v2 ->
                    Toast.makeText(
                        this@MainActivity,
                        "Negative",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .create()
                .show()
            (v as TextView).text = "haha3";
        }
        HAHA = "test"
    }


    override fun onResume() {
        super.onResume()
    }
}
