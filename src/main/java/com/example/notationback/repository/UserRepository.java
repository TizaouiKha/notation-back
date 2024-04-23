package com.example.notationback.repository;

import com.example.notationback.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByMailAndPassword(String mail, String password);
}
