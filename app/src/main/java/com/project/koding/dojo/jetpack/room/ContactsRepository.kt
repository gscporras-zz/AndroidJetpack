package com.project.koding.dojo.jetpack.room

import android.app.Application
import android.os.AsyncTask
import com.project.koding.dojo.jetpack.Contacto

class ContactsRepository(application: Application) {
    private val contactDao: ContactoDAO? = ContactsDatabase.getInstance(application)?.contactDao()

    fun insert(contact: Contacto) {
        if (contactDao != null) InsertAsyncTask(contactDao).execute(contact)
    }

    private class InsertAsyncTask(private val contactDao: ContactoDAO) :
        AsyncTask<Contacto, Void, Void>() {
        override fun doInBackground(vararg contacts: Contacto?): Void? {
            for (contact in contacts) {
                if (contact != null) contactDao.add(contact)
            }
            return null
        }
    }
}