package com.afoxplus.demo_config.demo.delivery.views.activities

import android.content.Intent
import com.afoxplus.demo_config.delivery.flow.StartDemoFlow
import com.afoxplus.uikit.activities.UIKitBaseActivity
import javax.inject.Inject

class StartDemoFlowImpl @Inject constructor() : StartDemoFlow {
    override fun start(activity: UIKitBaseActivity) {
        activity.startActivity(Intent(activity, MainActivity::class.java))
    }
}