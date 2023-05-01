package com.example.afinally

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent

import android.text.TextUtils
import android.widget.Toast
import com.example.afinally.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val mBinding: ActivityLoginBinding by lazy { ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

        initView()
    }

    private fun initView() {

        mBinding.registered.setOnClickListener {
            val name1 = mBinding.counter.text.toString()
            val password1 = mBinding.password.text.toString()
        }
        mBinding.login.setOnClickListener {
            //1.获取输入框的值
            startActivity(Intent(this, MainActivity::class.java))
//            val name = mBinding.counter.text.toString()
//            val password = mBinding.password.text.toString()
//            //2.判断是否为空
//            if(!TextUtils.isEmpty(name1) and !TextUtils.isEmpty(password1)){
//                if((password.equals(password1))and(name.equals(name1))){
//
//                }else{
//                    Toast.makeText(this@LoginActivity,"登录失败", Toast.LENGTH_SHORT).show()
//                }
//            }else{
//                Toast.makeText(this,"输入框不能为空", Toast.LENGTH_SHORT).show()
//            }
        }
    }
}