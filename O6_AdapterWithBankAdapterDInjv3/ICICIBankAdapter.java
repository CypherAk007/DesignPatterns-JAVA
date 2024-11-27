package O6_AdapterWithBankAdapterDInjv3;

public class ICICIBankAdapter implements PhonePeBankAPI {
    private ICICIBankAPI iciciBankAPI;
    public ICICIBankAdapter(ICICIBankAPI iciciBankAPI){
        this.iciciBankAPI = iciciBankAPI;
    }

    @Override
    public int balanceCheck() {
        return iciciBankAPI.balanceChecker();
    }

    @Override
    public void moneyTransfer() {
        iciciBankAPI.moneyTransfering();
    }
}
