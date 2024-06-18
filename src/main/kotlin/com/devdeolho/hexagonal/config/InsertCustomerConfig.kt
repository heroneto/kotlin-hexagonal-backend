package com.devdeolho.hexagonal.config

import com.devdeolho.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.devdeolho.hexagonal.adapters.out.InsertCustomerAdapter
import com.devdeolho.hexagonal.application.core.usecase.InsertCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter
    ) = InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter)

}