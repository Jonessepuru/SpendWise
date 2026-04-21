package com.spendwise.prototype.data
import androidx.room.Entity; import androidx.room.PrimaryKey
@Entity(tableName="goals") data class BudgetGoal(@PrimaryKey val categoryId:Long, val minMonthly:Double, val maxMonthly:Double)