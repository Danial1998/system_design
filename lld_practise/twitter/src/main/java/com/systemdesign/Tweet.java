package com.systemdesign;

public class Tweet {
    String tweetId;
    String description;
    User poster;

    public Tweet(String tweetId, String description, User poster) {
        this.tweetId = tweetId;
        this.description = description;
        this.poster = poster;
    }
}
