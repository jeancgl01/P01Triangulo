package com.mtw.juancarlos.hellotoast

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onCalcular(view:View){

       /* val resultado = txtAltura.text.toString().toDouble() * txtBase.text.toString().toDouble() / 2.0
        val respuesta = "El área del triangulo es $resultado"
       Toast.makeText(this,respuesta,Toast.LENGTH_LONG).show()*/
        val intent:Intent = Intent(this,ConstraintLayout::class.java)
        startActivity(intent)
    }

}
