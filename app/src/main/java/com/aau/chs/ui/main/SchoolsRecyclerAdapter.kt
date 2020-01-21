package com.aau.chs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.home_page_schools_list.view.*

class SchoolsRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items = emptyList<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SchoolViewHolder (
            LayoutInflater.from(parent.context).inflate(R.layout.home_page_schools_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SchoolViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    fun submitList (schoolList: List<String>) {
        items = schoolList
        notifyDataSetChanged()
    }


    class SchoolViewHolder constructor( itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private val schoolName: TextView = itemView.school_name
        //private val description: TextView = itemView.school_details

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {

        }
        fun bind (school: String) {
            schoolName.text = school
        }
    }
}