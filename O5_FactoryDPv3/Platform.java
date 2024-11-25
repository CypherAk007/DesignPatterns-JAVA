package O5_FactoryDPv3;

import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv3.UIComponents.Button.Button;

public abstract class Platform {
    abstract void setRefreshRate();

    abstract UIComponentFactory createUIComponentFactory();
}
