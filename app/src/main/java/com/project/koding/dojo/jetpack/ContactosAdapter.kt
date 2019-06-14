package com.project.koding.dojo.jetpack

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_contacto.view.*

class ContactosAdapter(var context:Context?,var contactos : ArrayList<Contacto>) : RecyclerView.Adapter<ContactosAdapter.ViewHolder>(){

    //private var contactos : ArrayList<Contacto>? = null

    override fun getItemCount(): Int {
        return contactos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        var contacto = contactos[position]

        holder.txtNombre.text = contacto.nombres ?: ""
        holder.txtApellidos.text = contacto.apellidos?: ""
        holder.txtEdad.text = contacto.edad.toString()
        holder.txtSexo.text = contacto.sexo?: ""


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item_contacto, parent, false)
        return ViewHolder(view)
    }


    class ViewHolder(v : View) : RecyclerView.ViewHolder(v){
        var txtNombre = v.txtNombre
        var txtApellidos = v.txtApellidos
        var txtEdad = v.txtEdad
        var txtSexo = v.txtSexo
    }
}