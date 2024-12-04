package O11_Observer;

public class EmailSender implements OrderPlaceSubscriber{
    public void sendEmail(){
        System.out.println("Sending Email!!");
    }

//    @Override
//    public void onOrderPlaced() {
//        sendEmail();
//    }
}
