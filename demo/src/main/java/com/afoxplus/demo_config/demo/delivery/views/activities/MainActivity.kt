package com.afoxplus.demo_config.demo.delivery.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.afoxplus.demo_config.delivery.global.DemoProperties
import com.afoxplus.demo_config.demo.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appProperties: DemoProperties
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}