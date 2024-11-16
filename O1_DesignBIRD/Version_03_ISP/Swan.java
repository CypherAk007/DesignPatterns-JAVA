package O1_DesignBIRD.Version_03_ISP;

public class Swan implements Flyable{
//    SFB sfb = new SFB();

//    @Override
//    public void fly(){
//        sfb.fly();
//    }

//    To change to FFB we need to change the code
    FFB ffb = new FFB();
    @Override
    public void fly(){
        ffb.fly();
    }
}

