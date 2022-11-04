package com.example.coalba.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.coalba.R
import com.example.coalba.data.response.ResponseWeekCalendarData
import java.util.*

class WeekCalendarAdapter(private val scList: ArrayList<ResponseWeekCalendarData>) : RecyclerView.Adapter<WeekCalendarAdapter.WeekCalendarViewHolder>(){

    var drawable: Drawable? = null

    class WeekCalendarViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val datetv: TextView = view.findViewById(R.id.tv_date)
        val daytv: TextView = view.findViewById(R.id.tv_day)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekCalendarViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_weekcalendar,parent,false)
        return WeekCalendarViewHolder(view)
    }

    override fun onBindViewHolder(holder: WeekCalendarViewHolder, position: Int) {
        holder.datetv.text = scList[position].date
        holder.daytv.text = scList[position].day
        /*holder.datetv.setOnClickListener {
            holder.datetv.setBackgroundResource(R.drawable.bg_weekcalendar)
        }*/
    }

    override fun getItemCount() = scList.size
}