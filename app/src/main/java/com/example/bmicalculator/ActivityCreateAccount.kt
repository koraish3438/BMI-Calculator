package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bmicalculator.databinding.ActivityCreateAccountBinding

class ActivityCreateAccount : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }

        binding.regBtn.setOnClickListener {
            hideKeyboard()

            val name = binding.etName.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val password = binding.etPassword.text.toString().trim()
            val confirmPassword = binding.etConfirmPassword.text.toString().trim()

            if (name.isEmpty()) {
                Toast.makeText(this, "Name required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (email.isEmpty()) {
                Toast.makeText(this, "Email required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Invalid email", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                Toast.makeText(this, "Password required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if (password.length < 8) {
                Toast.makeText(this, "Password must be at least 8 characters", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (confirmPassword.isEmpty()) {
                Toast.makeText(this, "Confirm password required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if (confirmPassword != password) {
                Toast.makeText(this, "Password not match", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityBMI::class.java)
            startActivity(intent)

        }

        binding.cLogin.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)
        }
    }
    private fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}