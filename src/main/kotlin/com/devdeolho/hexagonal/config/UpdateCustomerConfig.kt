package com.devdeolho.hexagonal.config

import com.devdeolho.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.devdeolho.hexagonal.adapters.out.UpdateCustomerAdapter
import com.devdeolho.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.devdeolho.hexagonal.application.core.usecase.UpdateCustomerUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateCustomerAdapter: UpdateCustomerAdapter
    ) = UpdateCustomerUseCase(
            findCustomerByIdUseCase,
            findAddressByZipCodeAdapter,
            updateCustomerAdapter
        )


}