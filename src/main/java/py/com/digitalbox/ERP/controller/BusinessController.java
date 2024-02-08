package py.com.digitalbox.ERP.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import py.com.digitalbox.ERP.dto.business.BusinessRequest;
import py.com.digitalbox.ERP.dto.business.BusinessResponse;
import py.com.digitalbox.ERP.entity.Business;
import py.com.digitalbox.ERP.repository.BusinessRepository;

@RestController
@RequestMapping("/business")
public class BusinessController {

    @Autowired
    private BusinessRepository repository;

    @PostMapping
    public void create(@RequestBody @Valid BusinessRequest request) {
        repository.save( new Business(request) );
    }

    @GetMapping
    public Page<BusinessResponse> get (Pageable pageable) {
        return repository.findAll(pageable).map(BusinessResponse::new);
    }
}
