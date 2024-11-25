package O5_FactoryDPv2.UIComponents.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("IOS Button Clicked!!");
    }
}
