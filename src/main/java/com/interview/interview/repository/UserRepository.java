package com.interview.interview.repository;

import com.interview.interview.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity findByUserName(String userName);
}
