package com.ecommerce.product_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<String> getAllProducts(){
        return Arrays.asList("Product1","Product2","Product3");
    }

}