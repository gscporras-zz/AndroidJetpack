package com.project.koding.dojo.jetpack

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var context: Context = this@MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista = arrayListOf(
            Contacto("Giancarlo", "Lopez", 22, "masculino"),
            Contacto("Giancarlo", "Lopez", 22, "masculino"),
            Contacto("Giancarlo", "Lopez", 22, "masculino"),
            Contacto("Giancarlo", "Lopez", 22, "masculino"),
            Contacto("Giancarlo", "Lopez", 22, "masculino")
        )

        var contactosAdater = ContactosAdapter(context, lista)
        rvwContactos.adapter = contactosAdater
    }
}
