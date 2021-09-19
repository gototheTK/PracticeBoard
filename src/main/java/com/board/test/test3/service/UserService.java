package com.board.test.test3.service;

import com.board.test.test3.model.User;
import com.board.test.test3.repository.UserRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User 유저찾기(Integer id){
        return userRepository.findById(id).get();
    }




}
