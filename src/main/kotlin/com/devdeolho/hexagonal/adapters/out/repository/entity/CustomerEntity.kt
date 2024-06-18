package com.devdeolho.hexagonal.adapters.out.repository.entity

import com.devdeolho.hexagonal.application.core.domain.Customer
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId
@Document(collection = "customers")
data class CustomerEntity(
    @MongoId val id: String?,
    val name: String,
    val address: AddressEntity,
    val cpf: String,
    val isValidCpf: Boolean
) {
    constructor(customer: Customer): this(
        customer.id,
        customer.name,
        AddressEntity(customer.address!!), // Operador !! precisa de atenção pois caso passe nulo ocorrerá erro de NullPointer.
        customer.cpf,
        customer.isValidCpf
    )
}
