package O5_FactoryDPv1;

import O5_FactoryDPv1.UIComponents.Button.AndroidButton;
import O5_FactoryDPv1.UIComponents.Button.Button;
import O5_FactoryDPv1.UIComponents.Button.IOSButton;

public abstract class Platform {
    abstract void setRefreshRate();
//    --------- M1 POOR WAY TO IMPLEMENT LIKE THIS -------------
    Button createButton(){
        Button button = null;
        if(this instanceof Android){
            button = new AndroidButton();
        }else if(this instanceof IOS){
            button = new IOSButton();
        }
        return button;
    }
}
