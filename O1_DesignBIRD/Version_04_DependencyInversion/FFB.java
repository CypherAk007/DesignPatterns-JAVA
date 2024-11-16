package O1_DesignBIRD.Version_04_DependencyInversion;

public class FFB implements FlyingBehaviour{
    @Override
    public void fly(){
        System.out.println("Fly Fast!!!");
    }
}
