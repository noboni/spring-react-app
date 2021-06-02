package com.interview.interview.entity;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "followers")
@Data
public class FollowerEntity {
    @EmbeddedId
    FollowerPK followerPK;
}
