package O6_AdapterWithRBIInterfacev1;

public class UPI {
    public boolean transfer(int amount, BankAPI yesBankAPI){
        if(yesBankAPI.checkBalance()>=amount){
            System.out.println("UPI Transfer is successful");
            return true;
        }
        return false;
    }
}
