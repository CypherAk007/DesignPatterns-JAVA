package O7_SocialAdapter;

public class XTweet {
    private String id;
    private String tweet;
    private Long userId;

    public XTweet(String id, String tweet, Long userId) {
        this.id = id;
        this.tweet = tweet;
        this.userId = userId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
