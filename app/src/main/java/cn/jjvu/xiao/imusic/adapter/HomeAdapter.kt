package cn.jjvu.xiao.imusic.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cn.jjvu.xiao.imusic.widget.HomeItemView

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeHolder>() {

    class HomeHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
        return HomeHolder(HomeItemView(parent.context))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {

    }
}