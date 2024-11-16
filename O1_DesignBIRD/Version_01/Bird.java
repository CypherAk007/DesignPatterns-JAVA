package O1_DesignBIRD.Version_01;

public class Bird {
    private String name;
    private boolean wings;
    private int age;
    private String type;
    public Bird(){}
    public Bird(String name, boolean wings, int age,String type){
        this.name = name;
        this.wings  = wings;
        this.age = age;
        this.type = type;
    }

    public void fly(){
        if(this.type.equals("Crow")){
            System.out.println("Slow fly");
        }else if(this.type.equals("Egle")) {
            System.out.println("fly High");
        }
        else{
            System.out.println("Default Fly");
        }
    }

}
