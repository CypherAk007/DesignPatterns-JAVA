package O6_AdapterWithBankAdapterDInjv3;

public class FastTag {
    public boolean recharge(int amount, PhonePeBankAPI bankAdapter){
        if(bankAdapter.balanceCheck()>=amount){
            System.out.println("Recharge is successful");
            return true;
        }
        return false;
    }
}
