package O7_SocialAdapter;

import java.util.List;

public class XAPI {
    public List<XTweet> getTweets(Long userId) {
        // Implementation to fetch Twitter tweets
        System.out.println("Fetching Tweets XAPI");
        return List.of(new XTweet("1", "Hello World", 1L));
    }

    public void tweet(Long userId, String text) {
        // Implementation to send a tweet on Twitter
        System.out.println("Posted the tweet XAPI "+userId+" "+text);
    }
}