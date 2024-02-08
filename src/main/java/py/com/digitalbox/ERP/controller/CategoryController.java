package py.com.digitalbox.ERP.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import py.com.digitalbox.ERP.dto.category.CategoryRequest;
import py.com.digitalbox.ERP.dto.category.CategoryResponse;
import py.com.digitalbox.ERP.entity.Category;
import py.com.digitalbox.ERP.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryRepository repository;

    @PostMapping
    public void create(@RequestBody @Valid CategoryRequest request) {
        repository.save(new Category(request));
    }

    @GetMapping
    public Page<CategoryResponse> get (Pageable pageable) {
        return repository.findAll(pageable).map(CategoryResponse::new);
    }
}
