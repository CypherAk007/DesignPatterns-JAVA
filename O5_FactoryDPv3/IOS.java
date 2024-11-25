package O5_FactoryDPv3;

import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv1.UIComponents.Dropdown.IOSDropdown;
import O5_FactoryDPv3.UIComponents.Button.Button;
import O5_FactoryDPv3.UIComponents.Button.IOSButton;

public class IOS extends Platform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIFactory();
    }


}
