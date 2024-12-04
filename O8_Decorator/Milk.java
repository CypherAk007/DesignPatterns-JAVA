package O8_Decorator;

public class Milk extends AddOn{
    private Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Milk Add Onn!!");
    }

    @Override
    public double cost() {
        return beverage.cost()+10;
    }
}
