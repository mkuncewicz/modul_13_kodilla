package com.kodilla.patterns.strategy.social;


import com.kodilla.patterns.strategy.social.socialmedia.TwitterPublisher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserTestSuite {


    @Test
    void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("Marek");
        User user2 = new YGeneration("Jurek");
        User user3 = new ZGeneration("Krzysiek");
        //When
        //Then
        Assertions.assertEquals("Facebook",user1.sharePost());
        Assertions.assertEquals("Twitter",user2.sharePost());
        Assertions.assertEquals("Snapchat",user3.sharePost());
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User user = new Millenials("Grzechu");
        //When
        String text = user.sharePost();
        System.out.println(user.getName() + ": " + text);
        user.setSocialPublisher(new TwitterPublisher());
        text = user.sharePost();
        System.out.println(user.getName() + ": "  + text);
        //Then
        Assertions.assertEquals("Twitter",user.sharePost());
    }

}
