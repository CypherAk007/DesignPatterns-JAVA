package O8_Decorator;

public class Decaf extends Beverage{
    @Override
    public void getDesc() {
        System.out.println("Decf");
    }

    @Override
    public double cost() {
        return 200;
    }
}
