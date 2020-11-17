package cn.jjvu.xiao.imusic.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView

class VBangFragment : BaseFragment()  {
    override fun initView(): View? {
        val tv = TextView(activity)
        tv.gravity = Gravity.CENTER
        tv.setTextColor(Color.RED)
        tv.text = javaClass.simpleName
        return tv
    }
}