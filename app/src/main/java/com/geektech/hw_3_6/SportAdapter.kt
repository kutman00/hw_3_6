package com.geektech.hw_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.hw_3_6.databinding.ItemSportBinding

class SportAdapter(val data: ArrayList<Sport>) :
    RecyclerView.Adapter<SportAdapter.SportViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportViewHolder {
        return SportViewHolder(
            ItemSportBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: SportViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size


    inner class SportViewHolder(private val binding: ItemSportBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(lesson: Sport) {
            binding.imageSport.drawable
            binding.sportName.text
            binding.parentConstraint

            Glide.with(binding.imageSport).load(lesson.image).into(binding.imageSport)
            lesson.color?.let { itemView.context.getColor(it) }
                ?.let { binding.parentConstraint.setBackgroundColor(it) }
            lesson.color_text?.let { itemView.context.getColor(it) }
                ?.let { binding.sportName.setBackgroundColor(it) }

        }


    }
}