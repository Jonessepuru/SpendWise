package com.spendwise.prototype.data
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity data class Expense(@PrimaryKey(autoGenerate=true) val id:Long=0, val userId:String, val amount:Double, val description:String, val category:String, val dateMillis:Long, val photoPath:String?=null)