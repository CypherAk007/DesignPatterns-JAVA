package O5_FactoryDPv2;

import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv1.UIComponents.Dropdown.IOSDropdown;
import O5_FactoryDPv2.UIComponents.Button.Button;
import O5_FactoryDPv2.UIComponents.Button.IOSButton;

public class IOS extends Platform {
    @Override
    public void setRefreshRate() {

    }

    @Override
    Button createButton() {
        return new IOSButton();
    }

    @Override
    Dropdown createDropdown() {
        return new IOSDropdown();
    }


}
