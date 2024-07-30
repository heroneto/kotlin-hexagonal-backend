package com.devdeolho.hexagonal.application.ports.`in`

import com.devdeolho.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {

    fun find(id: String): Customer
}