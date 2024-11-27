package O6_AdapterWithBankAdapterDInjv3;

public class BankAdapterFactory {
    public static PhonePeBankAPI getAdapter(String bankName){
        PhonePeBankAPI bankAdapter = null;
        if(bankName.equals("ICICI")){
            ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
            bankAdapter= new ICICIBankAdapter(iciciBankAPI);
        }else if(bankName.equals("YesBank")){
            YesBankAPI yesBankAPI = new YesBankAPI();
            bankAdapter= new YesBankAdapter(yesBankAPI);
        }
        return bankAdapter;
    }
}
