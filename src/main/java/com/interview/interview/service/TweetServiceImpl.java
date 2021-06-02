package com.interview.interview.service;

import com.interview.interview.ExceptionHandler.NotFound;
import com.interview.interview.entity.TweetEntity;
import com.interview.interview.models.TweetRequest;
import com.interview.interview.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TweetServiceImpl implements TweetService{
    @Autowired
    TweetRepository tweetRepository;

    @

    @Override
    @Transactional(rollbackFor = Exception.class)
    public TweetEntity createTweet(TweetRequest tweetRequest) {
        TweetEntity tweetEntity = new TweetEntity();
        tweetEntity.setTweet(tweetRequest.getTweet());
        tweetEntity.setUserId(tweetRequest.getUserId());
        tweetRepository.save(tweetEntity);
        return tweetEntity;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public TweetEntity updateTweet(TweetRequest tweetRequest, int id) {
        TweetEntity tweetEntity = tweetRepository.findById(id).orElse(null);
        if(tweetEntity == null){
            throw new NotFound("Tweet Not found to update");
        }
        tweetEntity.setTweet(tweetRequest.getTweet());
        tweetEntity.setUserId(tweetRequest.getUserId());
        tweetRepository.save(tweetEntity);
        return tweetEntity;
    }

    @Override
    public TweetEntity getTweet(int id) {
        TweetEntity tweetEntity = tweetRepository.findById(id).orElse(null);
        if(tweetEntity == null){
            throw new NotFound("Tweet Not found to update");
        }
        return tweetEntity;
    }

    @Override
    public List<TweetEntity> getAllTweetsOfAUser(int userId) {
        List<TweetEntity> entities = tweetRepository.findByUserId(userId);
        if(entities == null){
            return new ArrayList<>();
        }
        return entities;
    }

    @Override
    public List<TweetEntity> getAllTweetsOfUserFollowers(int userId) {
        return null;
    }
}
