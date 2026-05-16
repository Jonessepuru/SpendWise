package com.spendwise.prototype.data
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
class FirebaseRepository { private val auth=FirebaseAuth.getInstance(); private val db=FirebaseFirestore.getInstance(); val userId get()=auth.currentUser?.uid; suspend fun addExpense(e:Expense){ db.collection("users").document(userId!!).collection("expenses").add(e).await() } }