package com.interview.interview.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tweets")
@Data
public class TweetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "tweet")
    private String tweet;

    @Column(name = "user_id")
    private int userId;
}
