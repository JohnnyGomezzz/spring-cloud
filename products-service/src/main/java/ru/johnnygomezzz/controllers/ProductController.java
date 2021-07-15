package ru.johnnygomezzz.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.johnnygomezzz.ProductDto;
import ru.johnnygomezzz.models.Product;
import ru.johnnygomezzz.services.ProductService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private Product product;
    private final ProductService productService;

    @GetMapping("/get_products")
    public List<ProductDto> GetProducts() {
        List<ProductDto> productDtos = new ArrayList<>();
        List<Product> products = productService.findAll();
        for (Product p : products) {
            ProductDto productDto = new ProductDto(p.getId(), p.getTitle());
            productDtos.add(productDto);
        }
        return productDtos;
    }
}
