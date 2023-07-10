package com.afoxplus.module.delivery.global

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DemoProperties @Inject constructor() {

    var isDebug: Boolean = true
}