package com.interview.interview.controller;

import com.interview.interview.entity.UserEntity;
import com.interview.interview.models.UserAddOrLoginRequest;
import com.interview.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public UserEntity createUserOrLogin(@RequestBody UserAddOrLoginRequest request) {
        return userService.createOrLoginToUser(request);
    }

}
