package O6_AdapterWithRBIInterfacev1;

public class FastTag {
    public boolean recharge(int amount, BankAPI yesBankAPI){
        if(yesBankAPI.checkBalance()>=amount){
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
