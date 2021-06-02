package com.interview.interview.service;

import com.interview.interview.entity.TweetEntity;
import com.interview.interview.models.TweetRequest;
import java.util.*;

public interface TweetService {
    TweetEntity createTweet(TweetRequest tweetRequest);
    TweetEntity updateTweet(TweetRequest tweetRequest, int id);

    TweetEntity getTweet(int id);

    List<TweetEntity> getAllTweetsOfAUser(int userId);

    List<TweetEntity> getAllTweetsOfUserFollowers(int userId);

}
