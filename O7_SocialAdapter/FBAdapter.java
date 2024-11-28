package O7_SocialAdapter;

import java.util.List;

public class FBAdapter implements SocialMediaAPIInterface{
    private FbAPI fbAPI  = new FbAPI();
    @Override
    public List<SocialMediaPost> getFeed(Long userId, Long timestamp) {
        return fbAPI.fetchFacebookPosts(userId,timestamp)
                .stream()
                .map(post->new SocialMediaPost(post.getId(),post.getStatus(),post.getUserId(), post.getTimestamp()))
                .toList();
    }

    @Override
    public void putFeed(Long userId, String text) {
        fbAPI.postFacebookStatus(userId,text);

    }
}
