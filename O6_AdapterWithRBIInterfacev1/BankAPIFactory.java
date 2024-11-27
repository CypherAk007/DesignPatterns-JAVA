package O6_AdapterWithRBIInterfacev1;

public class BankAPIFactory {
    public static BankAPI getBankAPI(String BankName){
        BankAPI bankAPI = null;
        if(BankName.equals("ICICI")){
            bankAPI = new ICICIBankAPI();

        }else if(BankName.equals("YesBank")){
            bankAPI = new YesBankAPI();

        }
        return bankAPI;
    }
}
