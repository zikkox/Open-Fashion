package com.example.openfashion

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.openfashion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val garments = listOf(
            Garment(R.drawable.image, "Mohan", "Recycle Boucle Knit Cardigan Brown", 120),
            Garment(R.drawable.image, "Calvin Klein", "Leather Bag Beige", 240),
            Garment(R.drawable.image, "Zara", "Pants Beige", 89)
        )

        binding.recyclerView.adapter = GarmentAdapter(garments)
    }
}