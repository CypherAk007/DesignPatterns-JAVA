package O7_SocialAdapter;

import java.util.List;

public interface SocialMediaAPIInterface {
    List<SocialMediaPost> getFeed(Long userId, Long timestamp);
    void putFeed(Long user, String text);
}
