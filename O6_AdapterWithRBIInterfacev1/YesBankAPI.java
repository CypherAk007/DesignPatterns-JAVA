package O6_AdapterWithRBIInterfacev1;

public class YesBankAPI  implements BankAPI{

    public int checkBalance(){
        return 100;
    }

    public void transfer(){
        System.out.println("Money Transferred to YesBank");
    }
}