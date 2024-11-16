package O1_DesignBIRD.Version_03_ISP;

public abstract class Bird {
    private String name;
    private boolean wings;
    private int age;
    private String type;
    public Bird(){}
    public Bird(String name, boolean wings, int age, String type){
        this.name = name;
        this.wings  = wings;
        this.age = age;
        this.type = type;
    }

    public abstract void walk();
    public abstract void eat();

}
