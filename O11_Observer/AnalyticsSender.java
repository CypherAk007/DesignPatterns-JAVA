package O11_Observer;

public class AnalyticsSender implements OrderPlaceSubscriber{

    public AnalyticsSender(){
        Amazon.getInstance().registerOrderPlacedSubscriber(this);
    }
    public void sendAnalyticsData(){
        System.out.println("Send Analytics Data!!");
    }

    @Override
    public void announceOrderPlaced() {
        sendAnalyticsData();
    }
}
