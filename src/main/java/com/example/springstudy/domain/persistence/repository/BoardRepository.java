package com.example.springstudy.domain.persistence.repository;

import com.example.springstudy.domain.persistence.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends CrudRepository<Board, Long> {

    List<Board> findAll();
}
