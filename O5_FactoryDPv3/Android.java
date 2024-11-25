package O5_FactoryDPv3;

import O5_FactoryDPv1.UIComponents.Dropdown.AndroidDropdown;
import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv3.UIComponents.Button.AndroidButton;
import O5_FactoryDPv3.UIComponents.Button.Button;

public class Android extends Platform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIFactory();
    }


}
