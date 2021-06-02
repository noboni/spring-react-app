package com.interview.interview.controller;

import com.interview.interview.entity.TweetEntity;
import com.interview.interview.entity.UserEntity;
import com.interview.interview.models.TweetListResponse;
import com.interview.interview.models.TweetRequest;
import com.interview.interview.models.UserAddOrLoginRequest;
import com.interview.interview.service.TweetService;
import com.interview.interview.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tweet")
public class TweetController {
    @Autowired
    TweetService tweetService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public TweetEntity createTweet(@RequestBody TweetRequest request) {
        return tweetService.createTweet(request);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public TweetEntity updateTweet(@RequestBody TweetRequest request,
                                   @PathVariable int id) {
        return tweetService.updateTweet(request, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TweetEntity getTweet(@PathVariable int id) {
        return tweetService.getTweet(id);
    }

    /**
     * This method return tweets of a specific user
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public TweetListResponse getTweetsOfUser(@PathVariable int id) {
        return TweetListResponse.builder()
                .tweets(tweetService.getAllTweetsOfAUser(id)).build();
    }
    /**
     * This method returns the latest 10 tweets of the followers of a specific user
     * @param id
     * @return
     */
    @RequestMapping(value = "/user/follower-tweet/{id}", method = RequestMethod.GET)
    public TweetListResponse getLatestTweetsOfUserFollowers(@PathVariable int id) {
        return TweetListResponse.builder()
                .tweets(tweetService.getAllTweetsOfAUser(id)).build();
    }

}
