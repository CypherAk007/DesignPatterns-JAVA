package O1_DesignBIRD.Version_04_DependencyInversion;

public class Client {
    public static void main(String[] args) {
//        Dependency Inversion
//        To make egle to fly slow we have to only change
//        FlyingBehaviour flyingBehaviour = new SFB();

        Egle egle = new Egle();
        egle.fly();

    }
}
