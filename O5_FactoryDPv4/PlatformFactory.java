package O5_FactoryDPv4;

public class PlatformFactory {
    public static Platform getPlatform(String platformName){
        //Simple Factory
        Platform platform = null;
        if(platformName.equals("IOS")){
            platform = new IOS();
        }else if(platformName.equals("Android")){
            platform = new Android();
        }
        return platform;
    }
}
