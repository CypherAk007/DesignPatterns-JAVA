package O1_DesignBIRD.Version_05_DependencyInjection;

public class SFB implements FlyingBehaviour {
    @Override
    public void fly(){
        System.out.println("Flying Slow!!!");
    }
}
