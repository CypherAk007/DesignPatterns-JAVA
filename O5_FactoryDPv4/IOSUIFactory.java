package O5_FactoryDPv4;


import O5_FactoryDPv4.UIComponents.Button.Button;
import O5_FactoryDPv4.UIComponents.Button.IOSButton;
import O5_FactoryDPv4.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv4.UIComponents.Dropdown.IOSDropdown;

public class IOSUIFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
