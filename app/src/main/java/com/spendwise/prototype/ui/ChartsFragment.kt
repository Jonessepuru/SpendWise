package com.spendwise.prototype.ui
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.charts.PieChart
import com.spendwise.prototype.R
class ChartsFragment:Fragment(R.layout.fragment_charts){ override fun onViewCreated(v:View,s:Bundle?){ val chart=v.findViewById<PieChart>(R.id.pieChart) } }