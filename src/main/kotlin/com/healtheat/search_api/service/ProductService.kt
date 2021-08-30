package com.healtheat.search_api.service

import com.healtheat.search_api.domain.Product
import com.healtheat.search_api.domain.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService(@Autowired private val productRepository: ProductRepository) {

    fun save() {
        val product = Product(
            name = "name",
            intakeWay = "intakeWay",
            shelfLifeMonth = "1",
            manufacturingNumber = "manufacturingNumber",
            mainFunctionality = "mainFunctionality",
            storageWay = "storageWay",
            licenseNumber = "licenseNumber",
            packingMaterial = "packingMaterial",
            intakePrecaution = "intakePrecaution",
            standardSpecification = "standardSpecification",
            properties = "properties",
            shape = "properties",
        )
        val savedProduct: Product = productRepository.save(product)
    }
}
