package com.spendwise.prototype.data
import androidx.room.Entity; import androidx.room.PrimaryKey
@Entity(tableName="expenses") data class Expense(@PrimaryKey(autoGenerate=true) val id:Long=0, val amount:Double, val description:String, val categoryId:Long, val dateMillis:Long, val photoPath:String?)