package com.afoxplus.module.demo.delivery.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.afoxplus.module.delivery.global.DemoProperties
import com.afoxplus.module.demo.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appProperties: DemoProperties
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}