package O1_DesignBIRD.Version_05_DependencyInjection;

public class Client {
    public static void main(String[] args) {
//        Dependency Injection
//        pass the behaviour from client
        FlyingBehaviour flyingBehaviour = new FFB();
//        zero line of code change in Classes
        Egle egle = new Egle(flyingBehaviour);
        egle.fly();

    }
}
