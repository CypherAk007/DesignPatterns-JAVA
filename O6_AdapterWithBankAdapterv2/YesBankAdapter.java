package O6_AdapterWithBankAdapterv2;

public class YesBankAdapter implements PhonePeBankAPI{
    private YesBankAPI yesBankAPI;
    public YesBankAdapter(){
        this.yesBankAPI = new YesBankAPI();
    }
    @Override
    public int balanceCheck() {
        return yesBankAPI.balanceCheck();
    }

    @Override
    public void moneyTransfer() {
        yesBankAPI.moneyTransfer();
    }
}
