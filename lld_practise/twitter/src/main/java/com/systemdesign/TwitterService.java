package com.systemdesign;

import java.util.ArrayList;
import java.util.List;

public class TwitterService {

    List<User> twitterUsers;
    List<Tweet> tweetList;

    public TwitterService() {
        this.twitterUsers = new ArrayList<>();
        this.tweetList = new ArrayList<>();
    }

    public void addUser(User user){
        twitterUsers.add(user);
    }

    public List<Tweet> getFeed(User user){
        //logic to accumulate all the tweets for user A
        List<Tweet> tweetList = new ArrayList<>();

        List<User> followingList = user.getFollowingList();

        //iterate over the following list
        for(User connection:followingList){
            List<Tweet> connectionTweetList = connection.getAllTweets();
            tweetList.addAll(connectionTweetList);
        }

        return  tweetList;
    }

    public void addTweet(Tweet tweet) {
        tweetList.add(tweet);
        //observer and listener
        tweet.poster.addTweet(tweet);
    }
}
