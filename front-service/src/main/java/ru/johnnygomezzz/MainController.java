package ru.johnnygomezzz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getDataFromProducts() {
        String answerFromProductsService = restTemplate.getForObject("http://product-client/products", String.class);
        return "From products: " + answerFromProductsService;
    }
}
