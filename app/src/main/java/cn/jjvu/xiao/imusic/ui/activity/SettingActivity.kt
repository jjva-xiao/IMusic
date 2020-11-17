package cn.jjvu.xiao.imusic.ui.activity

import android.preference.PreferenceManager
import androidx.appcompat.widget.Toolbar
import cn.jjvu.xiao.imusic.R
import cn.jjvu.xiao.imusic.base.BaseActivity
import cn.jjvu.xiao.imusic.util.ToolBarManager
import org.jetbrains.anko.find

class SettingActivity : BaseActivity(), ToolBarManager {

    override val toolBar: Toolbar
        get() =  find<Toolbar>(R.id.toolbar)

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolbar()
        //获取推送通知有没有选中
        val sp = PreferenceManager.getDefaultSharedPreferences(this)
        val push = sp.getBoolean("push", false)
        println("push=$push")
    }
}