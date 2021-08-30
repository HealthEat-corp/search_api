package com.healtheat.search_api.controller

import com.healtheat.search_api.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(@Autowired private val productService: ProductService) {

    @PostMapping("/product")
    fun save(): String {
        productService.save()
        return "OKOK"
    }
}
