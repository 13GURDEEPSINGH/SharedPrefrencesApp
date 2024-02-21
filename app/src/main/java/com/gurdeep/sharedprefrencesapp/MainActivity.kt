package com.gurdeep.sharedprefrencesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var btnred: Button?=null
    var btngreen: Button?=null
    var btnblue : Button?=null
    var tvcount : TextView?=null
    var btnsave : Button?=null
    var btnclearprefrece :Button?=null
    var lv : ListView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnred=findViewById(R.id.btnred)
        btngreen=findViewById(R.id.btngreen)
        btnblue=findViewById(R.id.btnblue)
        tvcount=findViewById(R.id.tvcount)
        btnsave=findViewById(R.id.btnsave)
        btnclearprefrece=findViewById(R.id.btnclearprefrence)
        lv=findViewById(R.id.lv)
    }
}