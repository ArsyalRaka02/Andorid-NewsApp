package com.example.newsappukk.user.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.newsappukk.R


/**
 * Created by Arsyal Raka on 08/04/20, 2020,
 * Saigusa231@gmail.com,
 * ScCreativeIndo
 */
class KategoriFragmentUI : Fragment()  {

    companion object {
        fun getInstance() : KategoriFragmentUI {
            return KategoriFragmentUI()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater!!.inflate(R.layout.fragment_kategori, container, false)
    }

}