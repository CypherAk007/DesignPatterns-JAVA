package O7_SocialAdapter;

import java.util.List;

public class SocialMediaManager {
    private FbAPI facebookApi = new FbAPI();
    private XAPI twitterApi = new XAPI();

    public void getMessages(Long userId, Long timestamp, String platform) {
        if (platform.equals("facebook")) {
            System.out.println("Fetching Posts!!");
            List<FbPost> posts = facebookApi.fetchFacebookPosts(userId, timestamp);
            System.out.println(posts);
        } else if (platform.equals("twitter")) {
            System.out.println("Fetching Tweets!!");
            List<XTweet> tweets = twitterApi.getTweets(userId);
            System.out.println(tweets);
        }

        // Convert the posts/tweets to a common format
    }
}
