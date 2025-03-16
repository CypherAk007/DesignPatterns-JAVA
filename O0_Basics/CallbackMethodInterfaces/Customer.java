package O0_Basics.CallbackMethodInterfaces;

public class Customer implements Member{
    private String name;
    public Customer(String name){
        this.name = name;
    }
    @Override
    public void callback(String message) {
        System.out.println("Regarding :"+message+" ."+name+" Will be visiting the store!!");
    }
}
