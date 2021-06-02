package com.interview.interview.repository;

import com.interview.interview.entity.TweetEntity;
import com.interview.interview.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TweetRepository extends JpaRepository<TweetEntity,Integer> {
    List<TweetEntity> findByUserId(int userId);
}
