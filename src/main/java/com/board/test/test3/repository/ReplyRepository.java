package com.board.test.test3.repository;

import com.board.test.test3.model.Reply;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
    
}
