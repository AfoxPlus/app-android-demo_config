package com.afoxplus.demo_config.delivery.views.activities

import com.afoxplus.demo_config.databinding.DemoConfigStartActivityBinding
import com.afoxplus.demo_config.delivery.flow.StartDemoFlow
import com.afoxplus.demo_config.delivery.global.DemoProperties
import com.afoxplus.uikit.activities.UIKitBaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DemoConfigStartActivity : UIKitBaseActivity() {

    private lateinit var binding: DemoConfigStartActivityBinding

    @Inject
    lateinit var demoProperties: DemoProperties

    @Inject
    lateinit var startDemoFlow: StartDemoFlow

    override fun setMainView() {
        binding = DemoConfigStartActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun setUpView() {
        binding.buttonContinue.setOnClickListener {
            demoProperties.isDebug = binding.checkbox.isChecked
            startDemoFlow.start(this)
        }

    }
}