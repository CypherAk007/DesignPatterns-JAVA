package O5_FactoryDPv4;

public class IOS extends Platform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIFactory();
    }


}
