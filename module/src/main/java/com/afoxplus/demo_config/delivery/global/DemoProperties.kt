package com.afoxplus.demo_config.delivery.global

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DemoProperties @Inject constructor() {

    var isDebug: Boolean = true
}