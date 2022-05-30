package com.geektech.hw_3_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class SportAdapter(private val data: ArrayList<Sport>) :
    RecyclerView.Adapter<SportAdapter.SportViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportViewHolder {
        return SportViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_sport, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SportViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size


    inner class SportViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var SportName: TextView? = null
        private lateinit var SportImage: ImageView
        private var SportParent: ConstraintLayout? = null


        fun bind(lesson: Sport) {
            SportImage = itemView.findViewById(R.id.image_sport)
            SportName = itemView.findViewById(R.id.sport_name)
            SportParent = itemView.findViewById(R.id.parent_constraint)

            SportName?.text = lesson.name
            Glide.with(SportImage).load(lesson.image).into(SportImage)
            lesson.color?.let { itemView.context.getColor(it) }
                ?.let { SportParent?.setBackgroundColor(it) }
            lesson.color_text?.let { itemView.context.getColor(it) }
                ?.let { SportName?.setBackgroundColor(it) }

        }


    }
}