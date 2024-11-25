package O5_FactoryDPv2;

import O5_FactoryDPv1.Platform;
import O5_FactoryDPv1.UIComponents.Dropdown.Dropdown;
import O5_FactoryDPv2.UIComponents.Button.Button;

public class Client {
    public static void main(String[] args) {

//        Because in Platform we are enforcing abstract classes like dropdown and button and other components
//                we have to move this code to else where and Platform do only its work - source -> M3

        Android android = new Android();
        Button androidButton = android.createButton();
        androidButton.click();
        Dropdown androidDropdown = android.createDropdown();
        androidDropdown.show();


        IOS ios = new IOS();
        Button iosButton = ios.createButton();
        iosButton.click();
        Dropdown iosDropdown = ios.createDropdown();
        iosDropdown.show();



    }
}
