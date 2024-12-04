package O8_Decorator;

public class Soy extends AddOn{
    private Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Soy Addon");
    }

    @Override
    public double cost() {
        return beverage.cost()+10;
    }
}
