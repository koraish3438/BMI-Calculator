package com.example.bmicalculator

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.bmicalculator.databinding.ActivityBmiBinding


class ActivityBMI : AppCompatActivity() {
    private lateinit var binding: ActivityBmiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBmiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calBtn.setOnClickListener {
            hideKeyboard()

            val weight = binding.weightEt.text.toString()
            val height = binding.heightEt.text.toString()

            if (!validateInput(weight, height)) return@setOnClickListener

            val weightVal = weight.toDouble()
            val heightM = height.toDouble() / 100
            val bmi = weightVal / (heightM * heightM)
            val bmiDigit = "%.2f".format(bmi).toDouble()

            binding.calCard.visibility = View.VISIBLE
            displayResult(bmiDigit)
        }
    }

    private fun displayResult(bmiDigit: Double) {
        var result = ""

        if (bmiDigit < 18.5) {
            result = "Category : Underweight"
        } else if (bmiDigit >= 18.5 && bmiDigit <= 24.99) {
            result = "Category : Healthy"
        } else if (bmiDigit >= 25.0 && bmiDigit <= 29.99) {
            result = "Category : Overweight"
        } else {
            result = "Category : Obese"
        }

        binding.countTxt.text = "Your BMI : ${bmiDigit.toString()}"
        binding.rangeTxt.text = "$result"
    }


    private fun validateInput(weight: String, height: String): Boolean {
        if (weight.isEmpty() || height.isEmpty()) {
            Toast.makeText(this, "Weight or Height cannot be empty", Toast.LENGTH_SHORT).show()
            return false
        }

        val weightVal = weight.toDoubleOrNull()
        val heightVal = height.toDoubleOrNull()

        if (weightVal == null || heightVal == null) {
            Toast.makeText(this, "Invalid input!", Toast.LENGTH_SHORT).show()
            return false
        }

        if (weightVal == 0.0 || heightVal == 0.0) {
            Toast.makeText(this, "Weight or Height cannot be zero", Toast.LENGTH_SHORT).show()
            return false
        }

        return true
    }
    private fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}