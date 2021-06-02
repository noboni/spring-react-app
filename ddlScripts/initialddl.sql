create database interview;
use interview;
CREATE TABLE users (
                       id int not null,
                       user_name varchar(255) not null,
                       access_permission BOOLEAN,
                       CONSTRAINT PK_users PRIMARY KEY (id),
                       CONSTRAINT UK_user_name UNIQUE (id)
);

CREATE TABLE tweets (
                        id int not null,
                        tweet varchar(120) not null,
                        user_id int not null,
                        CONSTRAINT PK_tweets PRIMARY KEY (id),
                        CONSTRAINT FK_tweets_user_id FOREIGN KEY (user_id) REFERENCES users(id)

);

CREATE TABLE followers (
                           user_id int not null,
                           follower_id int not null,
                           CONSTRAINT PK_followers PRIMARY KEY (user_id,follower_id),
                           CONSTRAINT FK_followers_user_id FOREIGN KEY (user_id) REFERENCES users(id),
                           CONSTRAINT FK_followers_follower_id FOREIGN KEY (follower_id) REFERENCES users(id)
);