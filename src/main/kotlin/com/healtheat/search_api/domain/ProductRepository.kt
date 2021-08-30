package com.healtheat.search_api.domain

import org.springframework.data.repository.Repository

interface ProductRepository : Repository<Product, String> {
    fun save(product: Product): Product
}
