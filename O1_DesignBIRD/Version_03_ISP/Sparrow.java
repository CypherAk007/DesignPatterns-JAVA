package O1_DesignBIRD.Version_03_ISP;


public class Sparrow extends Bird implements Flyable,Dance{
    @Override
    public void eat(){
        System.out.println("Eat Fast");
    }

    @Override
    public void walk(){
        System.out.println("Walk Fast");
    }

    @Override
    public void dance() {
        System.out.println("Dance Fast");
    }

    @Override
    public void fly() {
        System.out.println("Fly ");
    }
}
