package O11_Observer;

public class Client {
    public static void main(String[] args) {

        EmailSender emailSender = new EmailSender();
        AnalyticsSender analyticsSender  =  new AnalyticsSender();

        Amazon.getInstance().orderPlace();

//        What if some service stop working and we want to continue the operations
//        Make an API Call to deregister
        Amazon.getInstance().deRegisterOrderPlacedSubscriber(emailSender);

        System.out.println();
        Amazon.getInstance().orderPlace();


    }
}
