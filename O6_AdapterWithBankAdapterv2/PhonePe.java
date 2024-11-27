package O6_AdapterWithBankAdapterv2;

public class PhonePe {
    private YesBankAPI yesBankAPI;
    private FastTag fastTag;
    private UPI upiTransfer;
    PhonePe(){
        yesBankAPI = new YesBankAPI();
        fastTag = new FastTag();
        upiTransfer = new UPI();
    }
    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount,yesBankAPI);
    }

    public boolean upiTransfer(int amount){
        return upiTransfer.transfer(amount,yesBankAPI);
    }

}
