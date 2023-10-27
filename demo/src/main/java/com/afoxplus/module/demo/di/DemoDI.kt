package com.afoxplus.module.demo.di

import com.afoxplus.module.delivery.flow.StartDemoFlow
import com.afoxplus.module.demo.delivery.views.activities.StartDemoFlowImpl
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