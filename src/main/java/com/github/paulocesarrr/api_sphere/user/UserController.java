package com.github.paulocesarrr.api_sphere.user;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor(onConstructor_ = @__(@Autowired))
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@RequestParam UUID id) {
        return userService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody User user) {
        userService.save(user);
    }

}
