package O6_Adapter;

public class UPI {
    public boolean transfer(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.balanceCheck()>=amount){
            System.out.println("UPI Transfer is successful");
            return true;
        }
        return false;
    }
}
