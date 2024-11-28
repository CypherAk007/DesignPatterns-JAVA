package O7_SocialAdapter;

public class SocialMediaPost {
    private String id;
    private String text; //status for fb/ tweet for x
    private Long userId;
    private Long timestamp;// ts is null for twitter

    public SocialMediaPost(String id, String text, Long userId, Long timestamp) {
        this.id = id;
        this.text = text;
        this.userId = userId;
        this.timestamp = timestamp;
    }
}
