package com.example.bmicalculator

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bmicalculator.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backLogin.setOnClickListener {
            val intent = Intent(this, ActivityCreateAccount::class.java)
            startActivity(intent)
        }
        
        binding.btnLoginNow.setOnClickListener {
            hideKeyboard()

            val email = binding.etLoginEmail.text.toString().trim()
            val password = binding.etLoginPassword.text.toString().trim()

            if (email.isEmpty()) {
                Toast.makeText(this, "Email required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this, "Invalid email address", Toast.LENGTH_SHORT).show()
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

            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ActivityBMI::class.java)
            startActivity(intent)
        }
        binding.goToRegister.setOnClickListener {
            val intent = Intent(this, ActivityCreateAccount::class.java)
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