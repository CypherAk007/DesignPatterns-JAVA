package O5_FactoryDPv4;

import O5_FactoryDPv4.UIComponents.Button.Button;
import O5_FactoryDPv4.UIComponents.Dropdown.Dropdown;

public interface UIComponentFactory {
    Dropdown createDropdown();
    Button createButton();

}
