package com.interview.interview.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FollowerPK implements Serializable {
    @Column(name = "user_id")
    private int userId;
    @Column(name = "follower_id")
    private int followerId;
}
