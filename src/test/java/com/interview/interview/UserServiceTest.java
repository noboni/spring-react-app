package com.interview.interview;

import com.interview.interview.entity.UserEntity;
import com.interview.interview.models.UserAddOrLoginRequest;
import com.interview.interview.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testUserCreationOrLogin(){
        UserAddOrLoginRequest request = new UserAddOrLoginRequest();
        request.setUserName("noboni");
        UserEntity userName = userService.createOrLoginToUser(request);
        System.out.println(userName);
    }
}
