package ru.johnnygomezzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class FrontController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get_products")
    public ProductDto[] getDataFromProducts() {
        ProductDto[] answer = restTemplate.getForObject("http://localhost:8189/products/get_array", ProductDto[].class);
        return answer;
    }

    @GetMapping("/get_product")
    public ProductDto getProduct() {
        ProductDto answer =  restTemplate.getForObject("http://localhost:8189/products/get_product", ProductDto.class);
        return answer;
    }
}
