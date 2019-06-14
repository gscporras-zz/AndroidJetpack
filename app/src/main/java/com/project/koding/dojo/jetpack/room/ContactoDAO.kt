package com.project.koding.dojo.jetpack.room

import androidx.room.Insert
import com.project.koding.dojo.jetpack.Contacto

interface ContactoDAO {
    @Insert
    fun add(contact: Contacto)

}