package py.com.digitalbox.ERP.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import py.com.digitalbox.ERP.dto.brand.BrandRequest;
import py.com.digitalbox.ERP.dto.brand.BrandResponse;
import py.com.digitalbox.ERP.entity.Brand;
import py.com.digitalbox.ERP.repository.BrandRepository;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandRepository repository;

    @PostMapping
    public void create (@RequestBody @Valid BrandRequest request) {
        repository.save(new Brand(request));
    }

    @GetMapping
    public Page<BrandResponse> get (Pageable pageable) {
        return repository.findAll(pageable).map(BrandResponse::new);
    }
}
