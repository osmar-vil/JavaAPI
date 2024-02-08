package py.com.digitalbox.ERP.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import py.com.digitalbox.ERP.dto.product.ProductRequest;
import py.com.digitalbox.ERP.dto.product.ProductResponse;
import py.com.digitalbox.ERP.entity.Product;
import py.com.digitalbox.ERP.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid ProductRequest request) {
        repository.save(new Product(request));
    }

    @GetMapping
    public Page<ProductResponse> get (Pageable pageable) {
        return repository.findAll(pageable).map(ProductResponse::new);
    }
}
