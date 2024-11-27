package O5_FactoryDPv4;

public abstract class Platform {
    abstract void setRefreshRate();

    abstract UIComponentFactory createUIComponentFactory();
}
