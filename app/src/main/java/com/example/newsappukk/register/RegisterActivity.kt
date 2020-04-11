package com.example.newsappukk.register

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.newsappukk.R
import com.example.newsappukk.login.LoginActivity
import com.example.newsappukk.model.RegisterResponse
import com.example.newsappukk.utils.InitRetrofit
import kotlinx.android.synthetic.main.register_activity.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * Created by Arsyal Raka on 10/04/20, 2020,
 * Saigusa231@gmail.com,
 * ScCreativeIndo
 */
class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)


        btn_register.setOnClickListener {


            val username = et_username_register.text.toString().trim()
            val password = et_password_register.text.toString().trim()

            if (username.isEmpty()){
                et_username_register.error = "username required"
                et_username_register.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                et_password_register.error = "password required"
                et_password_register.requestFocus()
                return@setOnClickListener
            }

            InitRetrofit().getInitInstance().createUser(username, password)
                .enqueue(object : Callback<RegisterResponse>{
                    override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, t.message, Toast.LENGTH_LONG).show()
                    }

                    override fun onResponse(
                        call: Call<RegisterResponse>,
                        response: Response<RegisterResponse>
                    ) {
                        Toast.makeText(applicationContext, response.body()?.massage, Toast.LENGTH_LONG).show()
                    }

                })

        }

        tv_login.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

    }

}