package O6_AdapterWithBankAdapterv2;

public class PhonePe {
    private PhonePeBankAPI bankAdapter;
    private FastTag fastTag;
    private UPI upiTransfer;
    PhonePe(){
        bankAdapter = new YesBankAdapter();
        fastTag = new FastTag();
        upiTransfer = new UPI();
    }
    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount,bankAdapter);
    }

    public boolean upiTransfer(int amount){
        return upiTransfer.transfer(amount,bankAdapter);
    }

}
