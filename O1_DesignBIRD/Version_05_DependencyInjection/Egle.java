package O1_DesignBIRD.Version_05_DependencyInjection;

public class Egle implements Flyable {

    FlyingBehaviour flyingBehaviour;

//    To Make egle fly slow just one line change
//    FlyingBehaviour flyingBehaviour = new SFB();
    public Egle (FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }

    @Override
    public void fly(){
        flyingBehaviour.fly();
    }
}
