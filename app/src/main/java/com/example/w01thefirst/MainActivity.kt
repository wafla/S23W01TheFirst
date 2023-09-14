package com.example.w01thefirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w01thefirst.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { // B is A(IS A 관계)
    private lateinit var main: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) { // fun=function  카멜케이스  파스칼케이스
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)
        main.btnAdd.setOnClickListener{
            main.txtCount.text = "${++count}";
        }
        main.btnSub.setOnClickListener {
            if(count-1 >= 0)
                count--;
            main.txtCount.text = "${count}";
        }
        main.btnRes.setOnClickListener{
            count = 0;
            main.txtCount.text = "$count";
        }
    }
}