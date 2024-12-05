package O11_Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
//    Singleton impl
    private static Amazon instance;

    List<OrderPlaceSubscriber> orderPlaceSubscribers;

    private Amazon(){
        orderPlaceSubscribers = new ArrayList<>();

    }

//    Register
    public void registerOrderPlacedSubscriber(OrderPlaceSubscriber subscriber){
        orderPlaceSubscribers.add(subscriber);
    }

//    DeRegister
    public void deRegisterOrderPlacedSubscriber(OrderPlaceSubscriber subscriber){
        orderPlaceSubscribers.remove(subscriber);
    }

    public static Amazon getInstance(){
        if(instance==null){
            instance = new Amazon();
        }
        return instance;
    }

    public void orderPlace(){
//        Previously
//        invontory management
//        send email
//                analytics
//                        invoice gen
//        EmailSender emailSender = new EmailSender();
//        AnalyticsSender analyticsSender  =  new AnalyticsSender();

//        emailSender.sendEmail();
//        analyticsSender.sendAnalyticsData();

        orderPlaceSubscribers.forEach(OrderPlaceSubscriber::announceOrderPlaced);



    }
}
