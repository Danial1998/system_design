package com.systemdesign;

import java.util.ArrayList;
import java.util.List;

public class User {
    String userId;
    String firstName;
    List<Tweet> tweetList;
    List<User> followingList;

    public User(String userId, String firstName) {
        this.userId = userId;
        this.firstName = firstName;
        this.tweetList = new ArrayList<>();
        this.followingList = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void addTweet(Tweet tweet){
        tweetList.add(tweet);
    }

    public List<Tweet> getAllTweets(){
        return tweetList;
    }

    public void addFollowing(User user){
        followingList.add(user);
    }

    public List<User> getFollowingList(){
        return followingList;
    }
}
