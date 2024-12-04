package O8_Decorator;

public class HouseBlend extends Beverage{
    @Override
    public void getDesc() {
        System.out.println("HouseBlend");
    }

    @Override
    public double cost() {
        return 150;
    }
}
