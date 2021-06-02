package com.interview.interview.service;

import com.interview.interview.entity.UserEntity;
import com.interview.interview.models.UserAddOrLoginRequest;

public interface UserService {
    UserEntity createOrLoginToUser(UserAddOrLoginRequest request);

}
