package O1_DesignBIRD.Version_04_DependencyInversion;

public class SFB implements FlyingBehaviour{
    @Override
    public void fly(){
        System.out.println("Flying Slow!!!");
    }
}
