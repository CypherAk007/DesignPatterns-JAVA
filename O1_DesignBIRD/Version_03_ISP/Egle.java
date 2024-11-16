package O1_DesignBIRD.Version_03_ISP;


public class Egle extends Bird implements Flyable{
    @Override
    public void eat(){
        System.out.println("Eat Slow");
    }

    @Override
    public void walk(){
        System.out.println("Walk Less");
    }

    @Override
    public void fly(){
        System.out.println("Fly High");
    }
}
