package cn.jjvu.xiao.imusic.ui.activity

import androidx.appcompat.widget.Toolbar
import cn.jjvu.xiao.imusic.R
import cn.jjvu.xiao.imusic.base.BaseActivity
import cn.jjvu.xiao.imusic.util.FragmentUtil
import cn.jjvu.xiao.imusic.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity(), ToolBarManager{

//    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
        super.initListener()
        bottomBar.setOnTabSelectListener {
            val transient = supportFragmentManager.beginTransaction()
            transient.replace(R.id.container, FragmentUtil.fragmentUtil.getFragment(it)!!, it.toString())
            transient.commit()
        }
    }

    override val toolBar: Toolbar
        get() =  find<Toolbar>(R.id.toolbar)

}