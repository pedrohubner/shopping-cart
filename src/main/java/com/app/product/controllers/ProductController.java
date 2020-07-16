package com.app.product.controllers;

import com.app.AppFacade;
import com.app.product.models.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private final AppFacade appFacade;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return appFacade.createProduct(product);
    }

    @GetMapping(value = "/{id}")
    public Product findProduct(@PathVariable Long id) {
        return appFacade.findProductById(id);
    }

    @DeleteMapping
    public void deleteAllProduct() {
        appFacade.deleteAllProducts();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteProduct(@PathVariable Long id) {
        appFacade.deleteProductById(id);
    }
}
