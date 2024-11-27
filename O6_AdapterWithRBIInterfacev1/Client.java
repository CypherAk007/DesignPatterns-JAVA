package O6_AdapterWithRBIInterfacev1;

import java.util.Scanner;

public class Client {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String bankName = sc.nextLine();

//        Simple Factory -> to decide which bankapi wrt user input
        BankAPI bankAPI = BankAPIFactory.getBankAPI(bankName);

//        Dependency injection
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.rechargeFastTag(100);
        phonePe.upiTransfer(100);
    }
}
