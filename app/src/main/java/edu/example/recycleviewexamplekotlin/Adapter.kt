package edu.example.recycleviewexamplekotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val userList: ArrayList<UserModel>)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view_iten, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user : UserModel = userList[position]
        holder.bind(user)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {

        private var textView : TextView = view.findViewById(R.id.tvRecyclerViewItem)

        fun bind(user: UserModel) {
            textView.text = user.name
        }
    }
}