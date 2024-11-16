package O1_DesignBIRD.Version_01;

public class Client_v1 {
    public static void main(String[] args) {
        Bird Egle = new Bird("Egle1",true,40,"Egle");
        Egle.fly();

//        Violates SRP as fly() of Bird class should be only for one bird not
//                all birds - VIOLATES SRP

//        BUT FOR NEW BIRD LIKE SPARROW WE DONT HAVE THE CODE IN BIRD CLASS
//                SO NOW WE HAVE TO CHANGE THE CODE - VIOLATES OCP

        Bird Sparrow = new Bird("Sparrow1",true,40,"Sparrow");
        Sparrow.fly();

    }
}
