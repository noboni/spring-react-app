package com.interview.interview.service;

import com.interview.interview.entity.UserEntity;
import com.interview.interview.models.UserAddOrLoginRequest;
import com.interview.interview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UserEntity createOrLoginToUser(UserAddOrLoginRequest request) {
        UserEntity userEntity = userRepository.findByUserName(request.getUserName());
        if(userEntity == null){
            userEntity = new UserEntity();
            userEntity.setUserName(request.getUserName());
            //access permission is set to public initially
            userEntity.setAccessPermission(true);
            userEntity = userRepository.save(userEntity);
        }
        return userEntity;
    }
}
