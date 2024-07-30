package com.devdeolho.hexagonal.application.core.usecase

import com.devdeolho.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.devdeolho.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.devdeolho.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase (
    private val findCustomerByIdOutputPort : FindCustomerByIdOutputPort
) : FindCustomerByIdInputPort
{

    override fun find(id: String) = findCustomerByIdOutputPort.find(id) ?:  throw ObjectNotFoundException("Customer not found")
}