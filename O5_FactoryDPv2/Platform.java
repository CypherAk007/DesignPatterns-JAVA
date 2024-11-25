package O5_FactoryDPv2;

import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv2.UIComponents.Button.AndroidButton;
import O5_FactoryDPv2.UIComponents.Button.Button;
import O5_FactoryDPv2.UIComponents.Button.IOSButton;

import java.awt.*;

public abstract class Platform {
    abstract void setRefreshRate();

    abstract Button createButton();

    abstract Dropdown createDropdown();

//    --------- M1 POOR WAY TO IMPLEMENT LIKE THIS -------------
//    void createButton(){
//        Button button = null;
//        if(this instanceof Android){
//            button = new AndroidButton();
//        }else if(this instanceof IOS){
//            button = new IOSButton();
//        }
//    }
}
