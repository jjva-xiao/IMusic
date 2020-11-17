package cn.jjvu.xiao.imusic.util

import android.content.Intent
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import cn.jjvu.xiao.imusic.R
import cn.jjvu.xiao.imusic.ui.activity.SettingActivity

/**
 * 所有界面管理
 */
interface ToolBarManager {
    val toolBar : Toolbar
    fun initMainToolBar() {
        toolBar.setTitle("爱音乐")
        toolBar.inflateMenu(R.menu.main)
        toolBar.setOnMenuItemClickListener(object : Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                when (item?.itemId) {
                    R.id.setting -> {
                        //跳转到设置界面
                        toolBar.context.startActivity(Intent(toolBar.context, SettingActivity::class.java))
                    }
                }
                return true
            }

        })
    }
    fun initSettingToolbar(){
        toolBar.setTitle("设置界面")
    }
}
