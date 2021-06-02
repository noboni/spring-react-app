package com.interview.interview.repository;

import com.interview.interview.entity.FollowerEntity;
import com.interview.interview.entity.TweetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FollowerRepository extends JpaRepository<FollowerEntity,Integer> {

    List<Long> getFollowerIdsOfUser(Long userId);
}
