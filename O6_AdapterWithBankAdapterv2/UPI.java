package O6_AdapterWithBankAdapterv2;

public class UPI {
    public boolean transfer(int amount, PhonePeBankAPI bankAdapter) {
        if (bankAdapter.balanceCheck() >= amount) {
            System.out.println("Transfer is successful");
            return true;
        }
        return false;
    }
}
