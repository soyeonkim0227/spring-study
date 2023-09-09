package com.example.springstudy.domain.persistence.repository;

import com.example.springstudy.domain.persistence.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    Boolean existsByUsername(String username);
}
