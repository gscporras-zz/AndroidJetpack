package com.project.koding.dojo.jetpack.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.project.koding.dojo.jetpack.room.ContactoEntity.Companion.TABLE_NAME
import org.jetbrains.annotations.NotNull

@Entity(tableName = TABLE_NAME)
data class ContactoEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") @NotNull val id: String,
    @ColumnInfo(name = "user") @NotNull val user: String,
    @ColumnInfo(name = "password") @NotNull val password: String
) {
    companion object {
        const val TABLE_NAME = "CONTACT"
    }
}