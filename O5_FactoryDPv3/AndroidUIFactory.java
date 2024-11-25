package O5_FactoryDPv3;

import O5_FactoryDPv3.UIComponents.Button.AndroidButton;
import O5_FactoryDPv3.UIComponents.Button.Button;
import O5_FactoryDPv3.UIComponents.Dropdown.AndroidDropdown;
import O5_FactoryDPv3.UIComponents.Dropdown.Dropdown;

public class AndroidUIFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
