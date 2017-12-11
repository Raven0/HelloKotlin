package com.preangerstd.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setText("Click Me")

        button.setOnClickListener {

            textView.setText("Hello Kotlin!")
            Toast.makeText(this,"Kotlin Start Here!",Toast.LENGTH_LONG).show()

        }
    }
}
