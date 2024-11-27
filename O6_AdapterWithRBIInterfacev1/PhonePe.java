package O6_AdapterWithRBIInterfacev1;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTag fastTag;
    private UPI upiTransfer;
    PhonePe(BankAPI bankAPI){
        this.bankAPI = bankAPI;
        fastTag = new FastTag();
        upiTransfer = new UPI();
    }
    public boolean rechargeFastTag(int amount){
        return fastTag.recharge(amount,bankAPI);
    }

    public boolean upiTransfer(int amount){
        return upiTransfer.transfer(amount,bankAPI);
    }

}
