package O7_SocialAdapter;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class XAdapter implements SocialMediaAPIInterface{
    private XAPI xapi = new XAPI();
    @Override
    public List<SocialMediaPost> getFeed(Long userId, Long timestamp) {
        return xapi.getTweets(userId)
                .stream()
                .map((tweet)-> new SocialMediaPost(tweet.getId(),tweet.getTweet(),tweet.getUserId(),null))
                .toList();
    }

    @Override
    public void putFeed(Long userId, String text) {
        xapi.tweet(userId,text);
    }
}
