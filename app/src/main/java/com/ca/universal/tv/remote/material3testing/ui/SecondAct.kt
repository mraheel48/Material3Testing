package com.ca.universal.tv.remote.material3testing.ui

import android.content.res.Resources.Theme
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import android.widget.RadioButton
import androidx.annotation.ColorInt
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.WindowCompat
import com.ca.universal.tv.remote.material3testing.R
import com.ca.universal.tv.remote.material3testing.databinding.ActivitySecondBinding
import com.google.android.material.color.DynamicColors
import com.google.android.material.color.MaterialColors
import com.google.android.material.elevation.SurfaceColors
import com.google.android.material.radiobutton.MaterialRadioButton

class SecondAct : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setEnabled(binding.btn1,binding.radioButton)

        binding.btn1.setOnClickListener {
            setEnabled(binding.btn1,binding.radioButton)
        }

        binding.btn2.setOnClickListener {
            setEnabled(binding.btn2,binding.radioButton2)
        }

    }

    var oldView: ConstraintLayout? = null
    var oldRadioButton: MaterialRadioButton? = null

    fun setEnabled(con: ConstraintLayout, radioButton: MaterialRadioButton) {
        oldView?.setBackgroundResource(R.drawable.bg_round)
        oldRadioButton?.isChecked = false
        oldRadioButton = radioButton
        oldView = con
        oldView?.setBackgroundResource(R.drawable.bg_round_selection)
        oldRadioButton?.isChecked = true
    }
}