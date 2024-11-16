package O1_DesignBIRD.Version_04_DependencyInversion;

public class Egle implements Flyable{

    FlyingBehaviour flyingBehaviour = new FFB();

//    To Make egle fly slow just one line change
//    FlyingBehaviour flyingBehaviour = new SFB();

    @Override
    public void fly(){
        flyingBehaviour.fly();
    }
}
