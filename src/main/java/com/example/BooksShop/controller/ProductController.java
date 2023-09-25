package com.example.BooksShop.controller;

import com.example.BooksShop.domain.Product;
import com.example.BooksShop.dto.ProductDTO;
import com.example.BooksShop.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/product")
@RestController
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @PostMapping("/addProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public Product create(@RequestBody ProductDTO dto) { //Протестирован в Postman(работает)
        return productService.createProduct(dto);
    }
    @GetMapping("/getProductList")
    public ResponseEntity<List<Product>> readAll() { //Протестирован в Postman(работает)
        return mappingResponseListProduct(productService.readAll());
    }
    @GetMapping("/getProductById/{id}")
    public ResponseEntity<Product> readById(@PathVariable Long id) { //Протестирован в Postman(работает)
        return mappingResponseProduct(productService.readById(id));
    }
    @GetMapping("/category/{id}")
    public ResponseEntity<List<Product>> readByCategoryId(@PathVariable Long id) { //Протестирован в Postman(работает)
        return mappingResponseListProduct(productService.readByCategoryId(id));
    }
    @PutMapping("/updateProduct")
    public ResponseEntity<Product> update(@RequestBody Product Product) { //Протестирован в Postman(работает)
        return mappingResponseProduct(productService.update(Product));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { //Протестирован в Postman(работает)
        productService.delete(id);
    }
    private ResponseEntity<Product> mappingResponseProduct(Product product) {
        return new ResponseEntity<>(product, HttpStatus.OK);
    }
    private ResponseEntity<List<Product>> mappingResponseListProduct(List<Product> products) {
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
