package com.example.app1

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.app1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        handleUser()
    }

    private fun handleUser() {
        binding.textView3.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Tentang Saya")
            builder.setMessage(
                "Tentang Saya: Hi, I’m Gania Alma Salsabila, a student at SMKN 24 Jakarta majoring in Software Engineering. " +
                        "I’m passionate about technology and enjoy exploring new ideas, learning cool things, and solving problems creatively. " +
                        "In my free time, I like watching movies, experimenting in the kitchen, or diving into fun projects. " +
                        "For me, every day is an opportunity to grow and create something amazing!"
            )
            builder.setPositiveButton("OK") { dialog, _ ->
                dialog.dismiss()
            }

            val dialog = builder.create()
            dialog.show()
            Toast.makeText(applicationContext, "Tentang Saya", Toast.LENGTH_LONG).show()
        }

        binding.btnKeluar.setOnClickListener {
            finishAffinity()
        }

        // Tambahkan event untuk buttonProject1
        binding.buttonProject1.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
