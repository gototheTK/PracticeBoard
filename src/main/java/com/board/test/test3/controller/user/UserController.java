package com.board.test.test3.controller.user;

import com.board.test.test3.model.User;
import com.board.test.test3.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

 
    
}
