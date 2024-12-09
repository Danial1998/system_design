package com.systemdesign;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TwitterService twitter = new TwitterService();

        User A = new User("A","A");
        User B = new User("B","B");
        User C = new User("C","C");
        User D = new User("D","D");

        A.addFollowing(B);
        A.addFollowing(C);

        Tweet tweet1 = new Tweet("tweet1","desc1",B);
        Tweet tweet2 = new Tweet("tweet2","desc2",C);
        Tweet tweet3 = new Tweet("tweet3","desc3",B);
        Tweet tweet4 = new Tweet("tweet4","desc4",D);

        twitter.addTweet(tweet1);
        twitter.addTweet(tweet2);
        twitter.addTweet(tweet3);
        twitter.addTweet(tweet4);

        twitter.addUser(A);
        twitter.addUser(B);
        twitter.addUser(C);

        List<Tweet> tweets = twitter.getFeed(A);
        for(Tweet tweet:tweets){
            System.out.println(tweet.description + " is posted by " + tweet.poster.getFirstName());
        }
    }
}