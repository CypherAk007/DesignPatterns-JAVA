package O5_FactoryDPv3;

import O5_FactoryDPv3.UIComponents.Button.Button;
import O5_FactoryDPv3.UIComponents.Dropdown.Dropdown;

public interface UIComponentFactory {
    Dropdown createDropdown();
    Button createButton();

}
