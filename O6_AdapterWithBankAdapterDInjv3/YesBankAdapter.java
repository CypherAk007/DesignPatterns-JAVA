package O6_AdapterWithBankAdapterDInjv3;

public class YesBankAdapter implements PhonePeBankAPI {
    private YesBankAPI yesBankAPI;
    public YesBankAdapter(YesBankAPI yesBankAPI){
        this.yesBankAPI = yesBankAPI;
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
