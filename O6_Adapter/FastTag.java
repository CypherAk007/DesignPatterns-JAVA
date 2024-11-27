package O6_Adapter;

public class FastTag {
    public boolean recharge(int amount, YesBankAPI yesBankAPI){
        if(yesBankAPI.balanceCheck()>=amount){
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
