package com.devdeolho.hexagonal.adapters.out.repository.entity

import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.MongoId
@Document(collection = "customers")
data class CustomerEntity(
    @MongoId val id: String?,
    val name: String,
    val address: AdressEntity,
    val cpf: String,
    val isValidCpf: Boolean
)
