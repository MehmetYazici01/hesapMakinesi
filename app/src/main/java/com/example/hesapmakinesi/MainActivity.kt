package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewSonuc.text = "0"

        binding.buttonToplama.setOnClickListener {
            val alinanSayi1 = binding.editTextSayi1.text.toString()
            val alinanSayi2 = binding.editTextSayi2.text.toString()
            val sayi1 = alinanSayi1.toDouble()
            val sayi2 = alinanSayi2.toDouble()
            val toplama = sayi1 + sayi2
            binding.textViewSonuc.text = toplama.toString()
        }

        binding.buttonCikarma.setOnClickListener {
            val alinanSayi1 = binding.editTextSayi1.text.toString()
            val alinanSayi2 = binding.editTextSayi2.text.toString()
            val sayi1 = alinanSayi1.toDouble()
            val sayi2 = alinanSayi2.toDouble()
            val cikarma = sayi1 - sayi2
            binding.textViewSonuc.text = cikarma.toString()
        }

        binding.buttonCarpma.setOnClickListener {
            val alinanSayi1 = binding.editTextSayi1.text.toString()
            val alinanSayi2 = binding.editTextSayi2.text.toString()
            val sayi1 = alinanSayi1.toDouble()
            val sayi2 = alinanSayi2.toDouble()
            val carpma = sayi1 * sayi2
            binding.textViewSonuc.text = carpma.toString()
        }

        binding.buttonBolme.setOnClickListener {
            val alinanSayi1 = binding.editTextSayi1.text.toString()
            val alinanSayi2 = binding.editTextSayi2.text.toString()
            val sayi1 = alinanSayi1.toDouble()
            val sayi2 = alinanSayi2.toDouble()
            val bolme = sayi1 / sayi2
            binding.textViewSonuc.text = bolme.toString()
        }
    }
}