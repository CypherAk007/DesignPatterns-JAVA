package O7_SocialAdapter;

public class Client {
    public static void main(String[] args) {
        SocialMediaManager sm = new SocialMediaManager();
        sm.getMessages(1L,1L,"twitter");
        sm.getMessages(1L,1L,"facebook");
    }
}
