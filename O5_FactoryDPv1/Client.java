package O5_FactoryDPv1;

import O5_FactoryDPv1.UIComponents.Button.Button;


public class Client {
    public static Platform getPlatform(){
//        return new Android();
        return new IOS();
    }
    public static void main(String[] args) {
        Platform platform = Client.getPlatform();

        Button button = platform.createButton();
        button.click();
    }
}
