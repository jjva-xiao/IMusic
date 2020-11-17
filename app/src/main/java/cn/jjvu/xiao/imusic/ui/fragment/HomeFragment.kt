package cn.jjvu.xiao.imusic.ui.fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import cn.jjvu.xiao.imusic.R
import cn.jjvu.xiao.imusic.adapter.HomeAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home, null)
    }
    override fun initListener() {
        recycleView.layoutManager = LinearLayoutManager(context)
        val adapter = HomeAdapter()
        recycleView.adapter = adapter
    }
}