package O0_Basics.CallbackMethodInterfaces;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        Customer c1 = new Customer("Abhishek");
        Customer c2 = new Customer("Joe");
        Customer c3 = new Customer("Jane");
        store.registerCustomer(c1);
        store.registerCustomer(c2);
        store.registerCustomer(c3);

        store.inviteForSale("50% Off on All Ultra Luxury Cars!! BBT...");
    }
}
