package O5_FactoryDPv4;

public class Android extends Platform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIFactory();
    }


}
