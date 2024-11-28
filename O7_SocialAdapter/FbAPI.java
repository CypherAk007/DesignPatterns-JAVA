package O7_SocialAdapter;

import java.util.List;

public class FbAPI {
    public List<FbPost> fetchFacebookPosts(Long userId, Long timestamp) {
        // Implementation to fetch Facebook posts
        System.out.println("Fetching FBPosts FBAPI");
        return List.of(new FbPost("1", "Hello World", 1L, 123456789L));
    }

    public void postFacebookStatus(Long user, String status) {
        // Implementation to post a status on Facebook
        System.out.println("Posted the post FBPosts FBAPI"+user.toString()+" "+status);
    }
}

