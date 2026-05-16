package com.spendwise.prototype.data
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity data class User(@PrimaryKey val username: String, val password: String)