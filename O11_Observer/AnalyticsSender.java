package O11_Observer;

public class AnalyticsSender implements OrderPlaceSubscriber{

    public void sendAnalyticsData(){
        System.out.println("Send Analytics Data!!");
    }

//    @Override
//    public void onOrderPlaced() {
//
//    }
}
