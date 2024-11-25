package O5_FactoryDPv3;


import O5_FactoryDPv3.UIComponents.Button.Button;
import O5_FactoryDPv3.UIComponents.Dropdown.Dropdown;

public class Client {

    public static void main(String[] args) {

//        Because in Platform we are enforcing abstract classes like dropdown and button and other components
//                we have to move this code to else where and Platform do only its work - source -> M3

        Platform android = new Android();
        UIComponentFactory androidFactory = new AndroidUIFactory();

//        Button androidButton = android.createButton();
        Button androidButton =androidFactory.createButton();
        androidButton.click();


        Dropdown androidDropdown = androidFactory.createDropdown();
        androidDropdown.show();


        Platform ios = new IOS();
        UIComponentFactory iosFactory = new IOSUIFactory();

        Button iosButton = iosFactory.createButton();
        iosButton.click();

        Dropdown iosDropdown = iosFactory.createDropdown();
        iosDropdown.show();



    }
}
