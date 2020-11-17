package cn.jjvu.xiao.imusic.util

import cn.jjvu.xiao.imusic.R
import cn.jjvu.xiao.imusic.ui.fragment.*

class FragmentUtil private constructor() {

    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vBangFragment by lazy { VBangFragment() }
    val yueDanFragment by lazy { YueDanFragment() }


    companion object {
        val fragmentUtil by lazy { FragmentUtil() }
    }

    fun getFragment(tabId : Int) : BaseFragment? {
        when(tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vbang -> return vBangFragment
            R.id.tab_yuedan -> return yueDanFragment
        }
        return null
    }
}