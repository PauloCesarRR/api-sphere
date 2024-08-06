package com.github.paulocesarrr.api_sphere.user;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor(onConstructor_ = @__(@Autowired))
public class UserService {

    private final UserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public User findById(UUID id) throws RuntimeException{
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Not Found User"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }


}
