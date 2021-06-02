package com.interview.interview.models;

import lombok.Data;

@Data
public class TweetRequest {
    private String tweet;
    private int userId;
}
