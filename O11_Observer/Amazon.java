package O11_Observer;

public class Amazon {

    public void orderPlace(){
//        Previously
//        invontory management
//        send email
//                analytics
//                        invoice gen
        EmailSender emailSender = new EmailSender();
        AnalyticsSender analyticsSender  =  new AnalyticsSender();

        emailSender.sendEmail();
        analyticsSender.sendAnalyticsData();



    }
}
