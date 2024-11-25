package O5_FactoryDPv2;

import O5_FactoryDPv1.UIComponents.Dropdown.AndroidDropdown;
import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv2.UIComponents.Button.AndroidButton;
import O5_FactoryDPv2.UIComponents.Button.Button;

public class Android extends Platform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    Button createButton() {
        return new AndroidButton();
    }

    @Override
    Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
