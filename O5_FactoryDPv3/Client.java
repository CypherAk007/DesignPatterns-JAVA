package O5_FactoryDPv3;


import O5_FactoryDPv3.UIComponents.Button.Button;
import O5_FactoryDPv3.UIComponents.Dropdown.Dropdown;

public class Client {
    public static Platform getPlatform(){
//        return new Android();
        return new IOS();
    }
    public static void main(String[] args) {
//        ABSTRACT FACTORY
//        Because in Platform we are enforcing abstract classes like dropdown and button and other components
//                we have to move this code to else where and Platform do only its work - source -> M3

        Platform platform = getPlatform(); //-> Dependency injected android/ios into platform

        UIComponentFactory factory = platform.createUIComponentFactory();

        Button button =factory.createButton();
        button.click();

        Dropdown dropdown = factory.createDropdown();
        dropdown.show();

    }
}
