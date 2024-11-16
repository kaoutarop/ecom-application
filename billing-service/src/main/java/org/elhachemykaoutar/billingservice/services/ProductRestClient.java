package org.elhachemykaoutar.billingservice.services;

import org.elhachemykaoutar.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "INVETORY-SERVICE")
public interface ProductRestClient {
    @GetMapping(path = ("/products/{id}"))
    public Product findProductById(@PathVariable Long id);
    @GetMapping("/products")
    PagedModel<Product> allProducts();
}
