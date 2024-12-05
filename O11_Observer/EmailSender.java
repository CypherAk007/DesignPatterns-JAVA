package O11_Observer;

public class EmailSender implements OrderPlaceSubscriber{
    public EmailSender(){
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }

    public void sendEmail(){
        System.out.println("Sending Email!!");
    }

    @Override
    public void announceOrderPlaced() {
        sendEmail();
    }
}
