package ru.johnnygomezzz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.johnnygomezzz.ProductDto;

import java.util.List;

@RestController
public class FrontController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get_products")
    public List<ProductDto> getProduct() {
        return restTemplate.getForObject("http://product-client/products/get_products", List.class);
    }
}
