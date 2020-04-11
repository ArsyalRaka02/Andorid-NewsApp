package com.example.newsappukk.user

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.newsappukk.R
import com.example.newsappukk.user.Fragment.HomeFragmentUI
import com.example.newsappukk.user.Fragment.KategoriFragmentUI
import kotlinx.android.synthetic.main.navigation_bottom.*


/**
 * Created by Arsyal Raka on 08/04/20, 2020,
 * Saigusa231@gmail.com,
 * ScCreativeIndo
 */
class MainActivity : AppCompatActivity() {

//    var isFragmentLoad = true
    val supportFragment = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_user)

        var menu : Menu = btm_nav.menu
        selectedMenu(menu.getItem(0))
        btm_nav.setOnNavigationItemSelectedListener { item : MenuItem ->
            selectedMenu(item)

            false
        }

    }

    private fun selectedMenu(item: MenuItem) {
        item.isChecked = true
        when (item.itemId) {
            R.id.nav_it_home        -> selectedFragment(HomeFragmentUI.getInstance())
            R.id.nav_it_kategori    -> selectedFragment(KategoriFragmentUI.getInstance())
        }
    }

    fun selectedFragment(fragment : Fragment){
        var transaction = supportFragment.beginTransaction()
        transaction?.replace(R.id.fl_user, fragment)
        transaction?.commit()
    }

    fun gantiFragment(fragmentManager: FragmentManager, fragment: Fragment, frameId: Int){
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment)
        transaction.commit()
    }


}