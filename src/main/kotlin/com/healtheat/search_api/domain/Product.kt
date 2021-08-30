package com.healtheat.search_api.domain

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "product", createIndex = true)
class Product (
    @Id
    val id: String? = null,
    val name: String,
    val intakeWay: String,
    val shelfLifeMonth: String,
    val manufacturingNumber: String,
    val mainFunctionality: String,
    val storageWay: String,
    val licenseNumber: String,
    val packingMaterial: String,
    val intakePrecaution: String,
    val standardSpecification: String,
    val properties: String,
    val shape: String
)
