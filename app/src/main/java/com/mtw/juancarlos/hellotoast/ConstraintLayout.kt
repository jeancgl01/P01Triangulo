package com.mtw.juancarlos.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_constraint_layout.*
import kotlinx.android.synthetic.main.activity_constraint_layout.view.*

class ConstraintLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_layout)

        val myBtn = Button(this)
        myBtn.text = "Mi boton"
        myBtn.width = 20
        myBtn.height = 20
        linearLayout.addView(myBtn)

    }
}
