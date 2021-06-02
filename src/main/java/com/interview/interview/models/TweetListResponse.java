package com.interview.interview.models;

import com.interview.interview.entity.TweetEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TweetListResponse {
    List<TweetEntity> tweets;
}
