package com.board.test.test3.repository;

import com.board.test.test3.model.Board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    
}
