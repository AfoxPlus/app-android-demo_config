package com.afoxplus.demo_config.di

import com.afoxplus.demo_config.delivery.global.AppPropertiesDemoConfig
import com.afoxplus.network.global.AppProperties
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DemoConfigModule {

    @Binds
    fun bindAppPropertiesDemo(impl: AppPropertiesDemoConfig): AppProperties
}