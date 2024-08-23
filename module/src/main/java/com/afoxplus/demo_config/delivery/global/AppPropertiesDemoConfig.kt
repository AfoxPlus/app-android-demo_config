package com.afoxplus.demo_config.delivery.global

import com.afoxplus.network.global.AppProperties
import javax.inject.Inject

class AppPropertiesDemoConfig @Inject constructor(private val properties: DemoProperties) :
    AppProperties {

    override fun getCurrencyID(): String = "61a18be00b6de1476436de41"

    override fun getDeviceData(): String = "demo_config"
    override fun getUserAuthFCMToken(): String = "fcm_token_demo"

    override fun getUserUUID(): String = "6c4795bd-5a51-46e3-8cf2-3943d53ae847"

    override fun isAppDebug(): Boolean = properties.isDebug
}