package com.example.openfashion

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.openfashion.databinding.ItemGarmentBinding

class GarmentAdapter(
    private val garments: List<Garment>
) : RecyclerView.Adapter<GarmentAdapter.GarmentViewHolder>() {

    // ViewHolder using View Binding
    class GarmentViewHolder(val binding: ItemGarmentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GarmentViewHolder {
        val binding = ItemGarmentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return GarmentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GarmentViewHolder, position: Int) {
        val garment = garments[position]
        holder.binding.apply {
            garmentName.text = garment.brand
            garmentType.text = garment.type
            garmentPrice.text = "$${garment.price}"
            garmentImage.setImageResource(garment.image)
        }
    }

    override fun getItemCount(): Int = garments.size
}
