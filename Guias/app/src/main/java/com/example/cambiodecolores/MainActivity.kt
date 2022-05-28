package com.example.cambiodecolores

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private val serviciosBtn : Button
        get() = findViewById(R.id.servicios_btn)
    private val portafolioBtn : Button
        get() = findViewById(R.id.potafolio_btn)
    private val aboutBtn : Button
        get() = findViewById(R.id.about_btn)
    private val contactoBtn : Button
        get() = findViewById(R.id.contacto_btn)
    private val redesBtn : Button
        get() = findViewById(R.id.redes_btn)

    private val textVAriable: TextView
        get() = findViewById(R.id.textVariable)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        serviciosBtn.setOnClickListener{
            toast(getString(R.string.btn_servicios_label))
            textVAriable.setText("Servicios")
        }
        portafolioBtn.setOnClickListener{
            toast(getString(R.string.btn_portafolio_label))
            textVAriable.setText("Portafolio")
        }
        aboutBtn.setOnClickListener{
            toast(getString(R.string.btn_about_label))
            textVAriable.setText("Acerca De")
        }
        contactoBtn.setOnClickListener{
            toast(getString(R.string.btn_contacto_label))
            textVAriable.setText("Contacto")
        }
        redesBtn.setOnClickListener{
            toast(getString(R.string.btn_redes_label))
            textVAriable.setText("Redes Sociales")
        }
    }
    private fun toast(text: String, duration: Int = Toast.LENGTH_LONG) =
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
    fun selectedButton(view: View) {
        if ( view.id === R.id.servicios_btn) {
            Toast.makeText( view.context, "Opción de Servicios", Toast.LENGTH_LONG).show()
        }
        Toast.makeText( view.context, "Evento no definido", Toast.LENGTH_LONG).show()
    }
}
