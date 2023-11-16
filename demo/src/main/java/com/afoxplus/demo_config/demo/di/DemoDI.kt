package com.afoxplus.demo_config.demo.di

import com.afoxplus.demo_config.delivery.flow.StartDemoFlow
import com.afoxplus.demo_config.demo.delivery.views.activities.StartDemoFlowImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DemoDI {

    @Binds
    fun bindDemoConfig(impl: StartDemoFlowImpl): StartDemoFlow
}