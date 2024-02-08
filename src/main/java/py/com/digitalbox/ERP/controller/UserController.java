package py.com.digitalbox.ERP.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import py.com.digitalbox.ERP.dto.user.UserRequest;
import py.com.digitalbox.ERP.dto.user.UserResponse;
import py.com.digitalbox.ERP.entity.User;
import py.com.digitalbox.ERP.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public void create(@RequestBody @Valid UserRequest request) {
        repository.save(new User(request));
    }

    @GetMapping
    public Page<UserResponse> get(Pageable pageable) {
        return repository.findAll(pageable).map(UserResponse::new);
    }

//    @GetMapping
//    public String get(int id) {
//        return "get one user";
//    }

    @PutMapping
    public String update(int id) {
        return "User updated successfully";
    }

    @DeleteMapping
    public String delete (int id) {
        return "User removed successfully";
    }

    @PostMapping("/auth")
    public String auth () {
        return "Token";
    }

}
