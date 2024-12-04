package O8_Decorator;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        System.out.println(b.cost());
        b.getDesc();
        b = new Milk(b);
        System.out.println(b.cost());
        b.getDesc();
        b = new Soy(b);
        System.out.println(b.cost());
        b.getDesc();

    }
}
