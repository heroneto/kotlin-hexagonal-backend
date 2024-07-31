package com.devdeolho.hexagonal.config

import com.devdeolho.hexagonal.adapters.out.DeleteCustomerByIdAdapter
import com.devdeolho.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.devdeolho.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.devdeolho.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerByIdConfig {

    @Bean
    fun deleteCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        deleteCustomerByIdAdapter: DeleteCustomerByIdAdapter
    ) = DeleteCustomerByIdUseCase(
            findCustomerByIdUseCase,
            deleteCustomerByIdAdapter
        )

}