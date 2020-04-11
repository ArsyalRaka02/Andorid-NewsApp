package com.example.newsappukk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.newsappukk.Fragment.HomeFragment
import com.example.newsappukk.Fragment.KategoriFragment
import com.example.newsappukk.Fragment.TambahHomeFragment
import com.example.newsappukk.Fragment.TambahKategoriFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var homeFragment: HomeFragment
    lateinit var kategoriFragment: KategoriFragment
    lateinit var TambahHomeFragment: TambahHomeFragment
    lateinit var TambahKategoriFragment: TambahKategoriFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.title = "NEWS APP"

        val drawerToogle : ActionBarDrawerToggle = object : ActionBarDrawerToggle (
            this,
            drawer_layout,
            toolbar,
            (R.string.open),
            (R.string.close)
        ) {

        }

        drawerToogle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToogle)
        drawerToogle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
        homeFragment = HomeFragment()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fl_main, homeFragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .commit()
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        when (menuItem.itemId) {
            R.id.it_home -> {
                homeFragment = HomeFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_main, homeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.it_kategori -> {
                kategoriFragment = KategoriFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_main, kategoriFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.add_berita -> {
                TambahHomeFragment = TambahHomeFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_main, TambahHomeFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
            R.id.add_kategori -> {
                TambahKategoriFragment = TambahKategoriFragment()
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fl_main, TambahKategoriFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                    .commit()
            }
        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {

        if (drawer_layout.isDrawerOpen(GravityCompat.START)){
            drawer_layout.closeDrawer(GravityCompat.START)
        }else {
            super.onBackPressed()
        }
    }
}
